package ch14.ex01.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static long count = 0;
    public static void printInfo(Class c) {
        count++;
        System.out.printf(count + ":SimpleName:%-25s interface:%-25s\n", c.getSimpleName(), c.isInterface());

    }
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 1 Check\n");
        Class c = null; // объект типа Class
        try {
            c = Class.forName("ch14.ex01.access.FancyToy"); // получить ссылку на класс
                                                         // ВНИМАНИЕ здесь указан путь к классу

        } catch (Exception e) {
            System.out.println("Class not found");
            System.exit(1);
        }
        printInfo(c);
        for (Class aClass : c.getInterfaces()) {
            printInfo(aClass);
        }
        Class up = c.getSuperclass();
        Object o = null; //
        try {
            o = up.newInstance(); // нужен конструктор Toy по умолчанию
        } catch (InstantiationException e) {
            System.out.println("Class can't init");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Class can't access");
            System.exit(1);
        }
        printInfo(o.getClass()); // получить объект Class из объекта

    }
}
