package ch21.ex06.codea;

import lib.threads.LiftOff;
import lib.utils.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SleepingTask extends LiftOff {
    @Override
    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.print(status()); // тоже самое
                TimeUnit.MILLISECONDS.sleep(100);  // задержка в каждом потоке
            }

        } catch (InterruptedException e) {
            System.err.println("#" + id + " interrupted");
        }
    }

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool(); // создали pool потоков
        List<Future<?>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(exec.submit(new SleepingTask()));
        }

        int index = 0;
        for (Future<?> fs : list) {
            while (!fs.isDone()) {
                Time.sleep(100);
            }
        }

        Thread.yield();   // освободить ресурсы
        exec.shutdown();  // приостановить прием потоков закрыть pool

        System.out.println("\nWaiting ExecutorService:");
        while (!exec.isTerminated()) {
            Time.sleep(10);
            System.out.print("?");
        }

    }

}
