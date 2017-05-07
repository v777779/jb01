package ch21.ex27.exercise;

import ch21.ex27.exercise.office.Restaurant2;
import ch21.ex27.exercise.rest.Restaurant;
import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 07-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 27 await() and signallAll() Check\n");
        Restaurant.check();
        Time.sleep(2100);
        System.out.println("\nOfficial solution");
        Restaurant2.check();
    }
}
