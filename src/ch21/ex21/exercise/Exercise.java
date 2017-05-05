package ch21.ex21.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 04-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 21 wait() Check\n");
        ExecutorService exec = Executors.newCachedThreadPool();
        BallWait ballWait = new BallWait();
        exec.execute(ballWait);
        exec.execute(new MatchRun(ballWait));

        exec.shutdown();

    }
}
