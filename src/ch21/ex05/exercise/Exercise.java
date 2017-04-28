package ch21.ex05.exercise;

import lib.threads.FbRun;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 05 Callable Check\n");
        ExecutorService exec = Executors.newCachedThreadPool();

        Future<Object> fs = exec.submit(Executors.callable(new FbRun(5)));
        try {
            System.out.println(fs.get());
        } catch (Exception e) {

        }

    }
}
