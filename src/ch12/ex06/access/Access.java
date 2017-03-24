package ch12.ex06.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 6 Custom Exception Class Check\n");

        try {
            throw new MyEx1();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            throw new MyEx1("MyEx1 Exception");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            throw new MyEx2(21);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            throw new MyEx2("MyEx2 Exception",17);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
