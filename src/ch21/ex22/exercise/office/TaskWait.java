package ch21.ex22.exercise.office;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskWait {
    private static int spins;

    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(10);
                        synchronized (this) {
                            notifyAll();
                        }
                    } catch (InterruptedException e) {
                        System.out.println("r1 interrupted");
                        return; // выходим по прерыванию
                    }
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        synchronized (r1) {
                            r1.wait();
                        }
                        spins++;
                        System.out.println("Spun " + spins + " times");
                        spins = 0;
                    } catch (InterruptedException e) {
                        System.out.println("r2 interrupted");
                        return;
                    }
                }
            }
        };
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(r1);
        exec.execute(r2);
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();
    }
}
