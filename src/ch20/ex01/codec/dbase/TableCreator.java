package ch20.ex01.codec.dbase;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
public class TableCreator {
    private static String getConstraints(Constraints constraints) {
        String sCon ="";
        if (!constraints.allowNull()) {
            sCon += " NOT NULL";
        }
        if (constraints.primaryKey()) {
            sCon += " PRIMARY KEY";
        }
        if (constraints.unique()) {
            sCon += " UNIQUE";
        }
        return sCon;
    }


    public static void check(String[] args) {
        if (args.length < 1) {
            System.out.println("arguments: annotated classes");
            args = new String[]{"ch20.ex01.codec.dbase.Member"};
//            args = new String[] { new Member().getClass().getName()};
        }
        try {
            for (String arg : args) {
                Class<?> className = Class.forName(arg);
                DBTable dbTable = className.getAnnotation(DBTable.class);
                if (dbTable == null) {
                    System.out.println("nNo DBTable annotations in class " + className.getSimpleName());
                    continue;
                }
//dbTableName
                String dbTableName = dbTable.name();
                if (dbTableName.length() < 1) {
                    dbTableName = className.getName().toUpperCase();  // используется имя класс DB
                }
                List<String> columnDefs = new ArrayList<>();
                for (Field field : className.getDeclaredFields()) {
                    String columnName = null;
                    Annotation[] annotations = field.getDeclaredAnnotations();
                    if (annotations.length < 1) {
                        continue;  // нет полей с аннотациями
                    }
                    if (annotations[0] instanceof SQLInteger) {  // считаем что только одна аннотация на поле
                        SQLInteger sInt = (SQLInteger) annotations[0];
                        if (sInt.name().length() < 1) {
                            columnName = field.getName().toUpperCase(); // берем имя аннотации с имени поля
                        } else {
                            columnName = sInt.name();
                        }
                        columnDefs.add(columnName + " INT " + getConstraints(sInt.constraints()));
                    }
                    if (annotations[0] instanceof SQLString) {  // считаем что только одна аннотация на поле
                        SQLString sStr = (SQLString) annotations[0];
                        if (sStr.name().length() < 1) {
                            columnName = field.getName().toUpperCase(); // берем имя аннотации с имени поля
                        } else {
                            columnName = sStr.name();
                        }
                        columnDefs.add(columnName + " VARCHAR(" + sStr.value() + ")" + getConstraints(sStr.constraints()));
                    }
                }
                    StringBuilder sb = new StringBuilder();
                    sb.append("CREATE TABLE "+dbTableName+" (");
                    for (String columnDef : columnDefs) {
                        sb.append("\n       "+columnDef+",");
                    }
                    String tableString = sb.substring(0, sb.length()-1)+");";  // строка команды
                    System.out.println("Table Creation SQL for "+className.getSimpleName()+" is :");
                    System.out.println(tableString);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
