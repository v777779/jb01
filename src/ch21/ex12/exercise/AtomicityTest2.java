package ch21.ex12.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtomicityTest2 implements Runnable {
    private int i = 0;

    public synchronized   int getValue() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        i++;
    }

    @Override
    public void run() {
        while (true) {
            evenIncrement();
            if (i > 1e8) {
                break;
            }
        }
        System.out.println("AtomicityTest exit...");
    }

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest2 at = new AtomicityTest2();
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

    }


}


