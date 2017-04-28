package ch21.ex07.codee;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BDaemon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Starting BDaemon");
            TimeUnit.MILLISECONDS.sleep(1);

        } catch (InterruptedException e) {
            System.out.println("Exiting via InterrupException");
        }finally {
            System.out.println("This should always run BDaemon");
        }
    }
}
