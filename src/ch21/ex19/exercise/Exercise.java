package ch21.ex19.exercise;

import ch21.ex19.exercise.future.OrnamentalGarden3;
import ch21.ex19.exercise.thread.OrnamentalGarden2;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 03-May-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 19 Interrupt Check\n");

        System.out.println("ExecutorService.shutdownNow() demo:");
        OrnamentalGarden1.check();

        System.out.println("\nThread.interrupt() demo:");
        OrnamentalGarden2.check();

        System.out.println("\nExecutorService.submit() Future.cancel() demo:");
        OrnamentalGarden3.check();

    }
}
