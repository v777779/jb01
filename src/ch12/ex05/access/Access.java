package ch12.ex05.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 5 While Exception Check\n");
        int k = 0;
        while (k++ < 10) {
            try {
                throw new Exception("Exception :" + k);
            } catch (Exception e) {
                System.out.println(e.getMessage());
//                e.fillInStackTrace().printStackTrace();
            }
        }
        System.out.println("Exited from Exception while() loop");

    }
}
