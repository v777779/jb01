package ch21.ex18.exercise;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LongTask implements Runnable {
    private LongDelay ld = new LongDelay();

    @Override
    public void run() {
        System.out.println("LongTask started:");
        ld.delay();
        System.out.println("LongTask finished");
    }

    public static void check() {
        System.out.println("ExecutorService interrupt():");
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(new LongTask());
        Time.sleep(1000);
        exec.shutdownNow();
        Time.sleep(100);


        System.out.println("\nThread interrupt():");
        Thread thread = new Thread(new LongTask());
        thread.start(); // запустили
        Time.sleep(1000);
        thread.interrupt(); // приостановить



    }
}
