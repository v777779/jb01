package ch14.ex18.access;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 10-Mar-17.
 */
class Methods {
    private static Pattern p = Pattern.compile("\\w+\\.|final\\s|native\\s"); // слова до точки
    private static Matcher m = p.matcher("");

    public static void show(String[]args) {
        if (args.length == 0) {
            return;
        }
        if (args.length == 1) {
            show(args[0]);          // ClassName
        } else {
            show(args[0],args[1]);  // ClassName, KeyWord
        }

    }


    public static void show(String cName) {

        System.out.println("All methods and constructors for:" + cName);
        System.out.println("---------------------------------");
        System.out.println("cName:" + cName);
        try {
            Class<?> c = Class.forName(cName);
            Method[] mets = c.getMethods();
            Constructor[] cons = c.getConstructors();

            System.out.println("Methods:");
            for (Method met : mets) {
                System.out.println(met.toString().replaceAll("\\w+\\.", ""));  // вырезаем все блоки  <wwww.>
//            m.reset(met.toString());
//            System.out.println("pmr:"+m.replaceAll("")); // заместить непонятно что
//            System.out.println(p.matcher(met.toString()).replaceAll("")); // заместить непонятно что
            }
            System.out.println("Constructors:");
            for (Constructor con : cons) {
                System.out.println(con.toString().replaceAll("\\w+\\.", ""));  // вырезаем все блоки  <wwww.>
            }


        } catch (Exception e) {
            System.out.println("Class not found: " + e.getMessage());
            throw new RuntimeException();
        }
    }


    public static void show(String cName, String cKey) {
        System.out.println("Methods and constructors:" + cName);
        System.out.println("---------------------------------");

        try {
            Class<?> c = Class.forName(cName);
            Method[] mets = c.getMethods();
            Constructor[] cons = c.getConstructors();


            System.out.println("Methods:");
            for (Method met : mets) {
                if (met.toString().indexOf(cKey) != -1) {
                    System.out.println(met.toString().replaceAll("\\w+\\.", ""));  // вырезаем все блоки  <wwww.>
                }
            }
            System.out.println("Constructors:");
            for (Constructor con : cons) {
                if (con.toString().indexOf(cKey) != -1) {
                    System.out.println(con.toString().replaceAll("\\w+\\.", ""));  // вырезаем все блоки  <wwww.>
                }
            }


        } catch (Exception e) {
            System.out.println("Class not found: " + e.getMessage());
            throw new RuntimeException();
        }

    }
}
