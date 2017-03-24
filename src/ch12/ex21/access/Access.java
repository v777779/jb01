package ch12.ex21.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 21 Exceptions from Parent Check\n");

        try {
            NClass n = new MClass();
        } catch (Exception e) {
            System.out.println("catch: main:"+e.getClass().getSimpleName());
        } finally {
        }
    }
}
