package ch12.ex09.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void f(int ex) throws ExBall, ExMove, ExJump {
        switch (ex) {
            default:
            case 1:
                throw new ExBall();
            case 2:
                throw new ExMove();
            case 3:
                throw new ExJump();
        }
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 9 Multi Exceptions Check\n");

        for (int i = 0; i < 4; i++) {
            try {
                f(i);
            } catch (Exception e) {
                System.out.println("catched: "+e.getClass().getSimpleName());

            }
        }
        System.out.println("\n..done");

    }
}
