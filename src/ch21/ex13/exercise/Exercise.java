package ch21.ex13.exercise;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 01-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 13 Volatile Check\n");

        System.out.println("\nVolatile Test:");
        SeralNumberChecker2.check();
        Time.sleep(150);
    }
}
