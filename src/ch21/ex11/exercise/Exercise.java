package ch21.ex11.exercise;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 29-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 11 Synchronized Check\n");

        System.out.println("Not Synchronized EventString");
        EventStringThread.check();
        Time.sleep(100);


        System.out.println("\nSynchronized EventString");
        SyncEventStringThread.check();


    }
}
