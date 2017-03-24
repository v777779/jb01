package ch14.ex02.access;

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
        System.out.println("\nExercise   Check\n");
        Class c = null; // объект типа Class
        try {
            c = Class.forName("ch14.ex02.access.FancyToy"); // получить ссылку на класс
        } catch (Exception e) {
            System.out.println("Class not found");
            System.exit(1);
        }
        printInfo(c);
        for (Class aClass : c.getInterfaces()) {
            printInfo(aClass);
        }

    }
}
