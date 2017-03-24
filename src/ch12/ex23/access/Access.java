package ch12.ex23.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 23 Check\n");
        try {
            FConst f = new FConst();
            try {
                System.out.println("working f");

            }finally {
                System.out.println("finally:");
                f.dispose();

            }
        } catch (Exception e) {
            System.out.println("catch:f.Constructor failed");
        }




    }
}
