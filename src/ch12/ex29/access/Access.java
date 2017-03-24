package ch12.ex29.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 29 RuntimeException Check\n");

        for (int i = 0; i < 25; i++) {
            try {
                StormyInning si = new StormyInning();//  baseBallEx, RainedOut
                si.atBat();             // Strike, PopFoul, Light
                si.rainHard();          // RainedOut
                si.event();
            } catch (RuntimeException e) {     // RainedOut, BaseBallEx, Foul, atBat Strike, Foul, Light
                System.out.print("catch2:");
                if (e.getMessage() != null) {
                    System.out.print(e.getMessage());
                }
                System.out.println(e.getClass().getSimpleName());

            }

        }

    }
}
