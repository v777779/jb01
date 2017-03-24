package ch14.ex09.access;

import java.lang.reflect.Field;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static int count = 0;
    private static final int MAX_LEVEL = 12;

    private static void getFields(Class c) {
        if (c.getFields().length > 0) {
            System.out.print("Fields:");
            Field[] сf = c.getFields(); // все поля
            for (Field field : сf) {
                System.out.print(field.getName() + " . ");
            }
            System.out.println();
        }
    }

    public static void getInfo(Class c) {
        if (count >= MAX_LEVEL) { // не пускает
            System.out.println("count: Max Level Riched");
            return;
        }
        count++;
        Class[] cc = c.getClasses();
        if (cc.length > 0) {
            for (Class aClass : cc) {
                getInfo(aClass);
            }
        } else {
//class or super class
            Class sc = c.getSuperclass();
            if (sc != null) {
                System.out.println("class:" + c.getSimpleName());
                getFields(c);

            } else {
                System.out.println("super_class:" + c.getSimpleName());
            }
//interfaces
            Class[] ci = c.getInterfaces();
            for (Class aClass : ci) {
                System.out.println("interface:" + aClass.getSimpleName());
                getFields(aClass);
                Class sc2 = aClass.getSuperclass();
                if (sc2 != null) {
                    getInfo(sc2);
                }
            }
//superclass
            if (sc != null) {
                getInfo(sc);
            }
        }
        count--;
    }


    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 9 Class Check\n");
        Shelf shelf = new Shelf();
        getInfo(shelf.getClass());


    }
}
