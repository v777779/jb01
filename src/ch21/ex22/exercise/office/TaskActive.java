package ch21.ex22.exercise.office;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskActive {
    private static boolean flag;
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
                    } catch (InterruptedException e) {
                        System.out.println("r1 interrupted");
                        return; // выходим по прерыванию
                    }
                    flag = true;
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    while (!flag && !Thread.currentThread().isInterrupted()) {  // не сбрасывает флаг прерывания
                        spins++;
                    }
                    System.out.println("Spun " + spins + " times");
                    spins = 0;
                    flag = false;
                    if(Thread.interrupted()) {  // сбрасывает флаг прерывания
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
