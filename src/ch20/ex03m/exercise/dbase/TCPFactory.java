package ch20.ex03m.exercise.dbase;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.SimpleElementVisitor8;
import java.util.Set;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 24-Apr-17.
 */
@SupportedAnnotationTypes({
        "ch20.ex03m.exercise.dbase.DBTable",
        "ch20.ex03m.exercise.dbase.Constraints",
        "ch20.ex03m.exercise.dbase.SQLString",
        "ch20.ex03m.exercise.dbase.SQLInteger"
})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class TCPFactory extends AbstractProcessor {
    private String sql = "";

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
//        System.out.println("***annotation processing started ***");
        for (Element element : env.getRootElements()) {
            element.accept(new V1(), null);
            for (Element element1 : element.getEnclosedElements()) {
                element1.accept(new V1(), null);
            }
            if (sql.length() < 1) {
                continue;
            }
            sql = sql.substring(0, sql.length() - 1) + ");";
            System.out.println("Creation SQL is :");
            System.out.println(sql);
            sql = "";
        }
        return true;
    }

    private class V1 extends SimpleElementVisitor8<Void, Void> {
        @Override
        public Void visitVariable(VariableElement e, Void aVoid) {
//            System.out.println("V1.visitVariable" + " :" + e.getSimpleName());
            String columnName = "";
            if (e.getAnnotation(SQLInteger.class) != null) {
                SQLInteger sVal = e.getAnnotation(SQLInteger.class);
                if (sVal.name().length() < 1) {
                    columnName = e.getSimpleName().toString().toUpperCase();
                } else {
                    columnName = sVal.name();
                }
                sql += "\n    " + columnName + " INT" + getConstraints(sVal.constraints()) + ",";
            }
            if (e.getAnnotation(SQLString.class) != null) {
                SQLString sVal = e.getAnnotation(SQLString.class);
                if (sVal.name().length() < 1) {
                    columnName = e.getSimpleName().toString().toUpperCase();
                } else {
                    columnName = sVal.name();
                }
                sql += "\n    " + columnName + " VARCHAR(" + sVal.value() + ")" +
                        getConstraints(sVal.constraints()) + ",";
            }
            if (e.getAnnotation(SQLShape.class)!= null) {  // считаем что только одна аннотация на поле
                SQLShape sVal = e.getAnnotation(SQLShape.class);
                if (sVal.name().length() < 1) {
                    columnName = e.getSimpleName().toString().toUpperCase(); // берем имя аннотации с имени поля
                } else {
                    columnName = sVal.name();
                }

                sql += "\n    "+ columnName + " SHAPE." + sVal.eshape().toString() +
                        getConstraints(sVal.constraints());
            }
            if (e.getAnnotation(SQLDouble.class)!= null) {  // считаем что только одна аннотация на поле
                SQLDouble sVal = e.getAnnotation(SQLDouble.class);
                if (sVal.name().length() < 1) {
                    columnName = e.getSimpleName().toString().toUpperCase(); // берем имя аннотации с имени поля
                } else {
                    columnName = sVal.name();
                }
                sql+= "\n    "+ columnName + " DOUBLE " + getConstraints(sVal.constraints());
            }

            return super.visitVariable(e, aVoid);
        }

        @Override
        public Void visitType(TypeElement e, Void aVoid) {
            DBTable dbTable = e.getAnnotation(DBTable.class);
            if (dbTable != null) {
                sql += "CREATE TABLE ";
                if ((dbTable.name()).length() < 1) {
                    sql += e.getSimpleName().toString().toUpperCase();
                } else {
                    sql += dbTable.name();
                }
                sql += " (";
            }
            return super.visitType(e, aVoid); // возврат
        }

        @Override
        public Void visitExecutable(ExecutableElement e, Void aVoid) {
            return super.visitExecutable(e, aVoid);
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
