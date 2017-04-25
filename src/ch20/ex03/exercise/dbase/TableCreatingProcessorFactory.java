package ch20.ex03.exercise.dbase;

import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import com.sun.mirror.util.*;

import java.util.*;

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
                "ch20.ex03.exercise.dbase.DBTable",
                "ch20.ex03.exercise.dbase.Constraints",
                "ch20.ex03.exercise.dbase.SQLString",
                "ch20.ex03.exercise.dbase.SQLInteger",
                "ch20.ex03.exercise.dbase.SQLDouble",
                "ch20.ex03.exercise.dbase.SQLShape"
        );
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
            System.out.println("***annotation processing exercise 03 started ***");

            for (TypeDeclaration type : env.getSpecifiedTypeDeclarations()) {
                type.accept(DeclarationVisitors.getDeclarationScanner(new TableCreationVisitor(), NO_OP));
                sql = sql.substring(0, sql.length() - 1) + ");";
                System.out.println("Creation SQL is :");
                System.out.println(sql);
                sql = "";
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


                if (d.getAnnotation(SQLShape.class)!= null) {  // считаем что только одна аннотация на поле
                    SQLShape sVal = d.getAnnotation(SQLShape.class);
                    if (sVal.name().length() < 1) {
                        columnName = d.getSimpleName().toUpperCase(); // берем имя аннотации с имени поля
                    } else {
                        columnName = sVal.name();
                    }

                    sql += "\n    "+ columnName + " SHAPE." + sVal.eshape().toString() +
                            getConstraints(sVal.constraints());
                }
                if (d.getAnnotation(SQLDouble.class)!= null) {  // считаем что только одна аннотация на поле
                    SQLDouble sVal = d.getAnnotation(SQLDouble.class);
                    if (sVal.name().length() < 1) {
                        columnName = d.getSimpleName().toUpperCase(); // берем имя аннотации с имени поля
                    } else {
                        columnName = sVal.name();
                    }
                    sql+= "\n    "+ columnName + " DOUBLE " + getConstraints(sVal.constraints());
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
