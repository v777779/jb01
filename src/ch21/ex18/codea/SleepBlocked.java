package ch21.ex18.codea;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SleepBlocked implements Runnable {

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptException");
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}
