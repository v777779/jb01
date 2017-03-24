package ch14.ex17.include;

import java.lang.reflect.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Methods {
    private static Pattern p = Pattern.compile("\\w+\\."); // слова до точки
    private static Matcher m = p.matcher("");

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


    public static void show(String[] args) {
        String cName = args[0];
        String cKey = args[1];
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
