package ch14.ex19.access;

import ch14.ex19.access.toys.*;

import java.lang.reflect.Constructor;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static Object getSuperObject(String cName, String cVal) {
        //ToyTest
        Class<?> c = null; // объект типа Class
        try {
            c = Class.forName(cName); // получить ссылку на класс
        } catch (Exception e) {
            System.out.println("Class not found");
            throw new RuntimeException();
        }

        Constructor<?>[] cons = c.getSuperclass().getConstructors();
//        System.out.println("cons.len:" + cons.length);
        Object s = null;  // заготовка для объекта

        for (Constructor con : cons) {
            Class[] params = con.getParameterTypes();

            if (params.length > 0) {
                try {
                    if (params[0] == int.class) {
                        s = con.newInstance(Integer.parseInt(cVal));  // стандартный
                         return s;
                    }
                    if (params[0] == Integer.class) {
                        s = con.newInstance(new Object[]{ Integer.valueOf(cVal) });  // более универсальный
                        return s;
                    }

                } catch (Exception e) {
                    System.out.println("Constructor failed:" + e.getMessage());
                    throw new RuntimeException();
                }
            }
        }

        System.out.println("Construction failed.");
        return null;  // не удалось создать объект


    }

    private static long count = 0;

    public static void printInfo(Class c) {
        count++;
        System.out.printf(count + ":SimpleName:%-25s interface:%-25s\n", c.getSimpleName(), c.isInterface());

    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 19   Check\n");
//ToyTest
        Object s = getSuperObject("ch14.ex19.access.toys.SuperToy", "120");
        System.out.println(s.getClass().getSimpleName()+":"+s);
        System.out.println(s instanceof ExtToy);
        ExtToy.class.cast(s).show();
        ExtToy.class.cast(s).list();


        ExtToy  s2 = (ExtToy)getSuperObject("ch14.ex19.access.toys.SuperToy", "120");
        System.out.println(s2.getClass().getSimpleName()+":"+s2);
        s2.list();
        s2.show();

    }
}
