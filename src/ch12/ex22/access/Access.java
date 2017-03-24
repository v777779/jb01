package ch12.ex22.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 22 Constructor Exception Check\n");

        try {
            FConst f = new FConst();
        } catch (Exception e) {
            System.out.println("catch:");
        } finally {
            System.out.println("finally:");
        }

        System.out.println("Normal Continue");

    }
}
