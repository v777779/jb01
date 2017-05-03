package ch21.ex20.exercise;

import ch21.ex20.exercise.office.CachedThreadPool3;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 03-May-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 20 Interrupt Check\n");
        System.out.println("CachedThreadPool :");
        CachedThreadPool2.check();

        System.out.println("\nCachedThreadPool Official solution :");
        CachedThreadPool3.check();

    }
}
