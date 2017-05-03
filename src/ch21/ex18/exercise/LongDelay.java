package ch21.ex18.exercise;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LongDelay {
    public synchronized void delay() {
        try {
            TimeUnit.SECONDS.sleep(10);

        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}
