package ch21.ex22.exercise;

import ch21.ex22.exercise.office.TaskActive;
import ch21.ex22.exercise.office.TaskWait;
import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 05-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 22 wait() Check\n");
        TaskFlag.check();
        Time.sleep(250);

        System.out.println("\nOfficial solution");
        System.out.println("\nWhile Active official:");
        TaskActive.check();
        Time.sleep(100);
        System.out.println("\nWhile Wait official:");
        TaskWait.check();


    }
}
