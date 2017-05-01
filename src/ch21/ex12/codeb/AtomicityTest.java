package ch21.ex12.codeb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtomicityTest implements Runnable {
    private int i = 0;

    public  int getValue() {
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
            if (i > 1e7) {
                break;
            }
        }
        System.out.println("AtomicityTest exit...");
    }

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);

        while (true) {
            int val = at.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                break;
            }
        }
        exec.shutdown();

    }


}


