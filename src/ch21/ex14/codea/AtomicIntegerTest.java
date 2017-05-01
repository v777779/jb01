package ch21.ex14.codea;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtomicIntegerTest implements Runnable {
    private AtomicInteger i = new AtomicInteger(0);

    public  int getValue() {
        return i.get();
    }

    private void evenIncrement() {
        i.addAndGet(2);
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            evenIncrement();
            if (count++ > 1e8) {
                break;
            }
        }
        System.out.println("AtomicIntegerTest exit...");
    }

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicIntegerTest at = new AtomicIntegerTest();
        exec.execute(at);

        int count = 0;
        while (true) {
            int val = at.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                break;
            }
            if (count++ > 1e8) {
                break;
            }

        }
        exec.shutdown();
        Time.sleep(500);

    }


}


