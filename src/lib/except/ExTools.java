package lib.except;

import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class ExTools {
    public static void f(int ex) throws ExBall, ExMove, ExJump {
        switch (ex) {
            default:
            case 1:
                throw new ExBall();
            case 2:
                throw new ExMove();
            case 3:
                throw new ExJump();
            case 4:
                throw new NullPointerException();
        }
    }

    public static void f() throws SwEx1, SwEx2, SwEx4 {
        int valRnd = new Random().nextInt(8);
        if (valRnd == 1) {
            throw new SwEx1();
        }
        if (valRnd == 2) {
            throw new SwEx2();
        }
        if (valRnd > 5) {
            throw new SwEx4();
        }
    }

    public static void fRt() throws SwEx1, SwEx2, SwEx4 {
        int valRnd = new Random().nextInt(8);

        if (valRnd == 1) {
            throw new SwEx1();
        }
        if (valRnd == 2) {
            throw new SwEx2();
        }
        if (valRnd > 5) {
            throw new SwEx4();
        } else {
            throw new RuntimeException();
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
