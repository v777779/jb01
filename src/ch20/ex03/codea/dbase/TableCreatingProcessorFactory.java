package ch20.ex03.codea.dbase;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.*;
import com.sun.mirror.util.DeclarationVisitors;
import com.sun.mirror.util.SimpleDeclarationVisitor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import static com.sun.mirror.util.DeclarationVisitors.NO_OP;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 24-Apr-17.
 */
public class TableCreatingProcessorFactory implements AnnotationProcessorFactory {
    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> set, AnnotationProcessorEnvironment env) {
        return new TableCreationProcessor(env);
    }

    @Override
    public Collection<String> supportedAnnotationTypes() {  // набор обрабатываемых аннотаций
        return Arrays.asList(
                "ch20.ex03.codea.dbase.DBTable",
                "ch20.ex03.codea.dbase.Constraints",
                "ch20.ex03.codea.dbase.SQLString",
                "ch20.ex03.codea.dbase.SQLInteger");
    }

    @Override
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }

    private static class TableCreationProcessor implements AnnotationProcessor {
        private AnnotationProcessorEnvironment env;
        private String sql = "";

        public TableCreationProcessor(AnnotationProcessorEnvironment env) {
            this.env = env;
        }

        @Override
        public void process() {
            System.out.println("***annotation processing started ***");

            for (TypeDeclaration type : env.getSpecifiedTypeDeclarations()) {
                type.accept(DeclarationVisitors.getDeclarationScanner(new TableCreationVisitor(), NO_OP));
                sql = sql.substring(0, sql.length() - 1) + ");";
                System.out.println("Creation SQL is :");
                System.out.println(sql);
                sql = "";
            }
            int count = 0;
            for (TypeDeclaration type : env.getSpecifiedTypeDeclarations()) {
                System.out.println("count:"+count++);
                type.accept(DeclarationVisitors.getDeclarationScanner(new V2(), NO_OP));
                System.out.println("count...");
            }
        }

        //class Visitor.pre
        private class V2 extends SimpleDeclarationVisitor {
            @Override
            public void visitClassDeclaration(ClassDeclaration d) {
                System.out.println("V2.visitClassDeclaration"+" :"+d.getSimpleName());
            }

            @Override
            public void visitFieldDeclaration(FieldDeclaration d) {
                System.out.println("V2.visitFieldDeclaration"+" :"+d.getSimpleName());
            }

            @Override
            public void visitMethodDeclaration(MethodDeclaration d) {
                System.out.println("V2.visitMethodDeclaration"+" :"+d.getSimpleName());

            }
        }

        private class TableCreationVisitor extends SimpleDeclarationVisitor {
            @Override
            public void visitClassDeclaration(ClassDeclaration d) {
                DBTable dbTable = d.getAnnotation(DBTable.class);
                if (dbTable != null) {
                    sql += "CREATE TABLE ";
                    if ((dbTable.name()).length() < 1) {
                        sql += d.getSimpleName().toUpperCase();
                    } else {
                        sql += dbTable.name();
                    }
                    sql += " (";
                }
            }

            @Override
            public void visitFieldDeclaration(FieldDeclaration d) {
                String columnName = "";
                if (d.getAnnotation(SQLInteger.class) != null) {
                    SQLInteger sVal = d.getAnnotation(SQLInteger.class);
                    if (sVal.name().length() < 1) {
                        columnName = d.getSimpleName().toUpperCase();
                    } else {
                        columnName = sVal.name();
                    }
                    sql += "\n    " + columnName + " INT" + getConstraints(sVal.constraints()) + ",";
                }
                if (d.getAnnotation(SQLString.class) != null) {
                    SQLString sVal = d.getAnnotation(SQLString.class);
                    if (sVal.name().length() < 1) {
                        columnName = d.getSimpleName().toUpperCase();
                    } else {
                        columnName = sVal.name();
                    }
                    sql += "\n    " + columnName + " VARCHAR(" + sVal.value() + ")" +
                            getConstraints(sVal.constraints()) + ",";
                }
            }

            private String getConstraints(Constraints con) {
                String constraints = "";
                if (!con.allowNull()) {
                    constraints += " NOT NULL";
                }
                if (con.primaryKey()) {
                    constraints += " PRIMARY KEY";
                }
                if (con.unique()) {
                    constraints += " UNIQUE";
                }
                return constraints;
            }

        }

    }


}
