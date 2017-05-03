package ch21.ex17.exercise;

import ch21.ex17.exercise.office.RadCounter2;
import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 03-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 17 Shutdown Check\n");
        RadCounter.check();
        Time.sleep(100);
        System.out.println("\nOffice solution:");
        RadCounter2.check();
    }
}
