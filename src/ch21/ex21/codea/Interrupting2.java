package ch21.ex21.codea;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 04-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Interrupting2 {
    public static void check() {
        try {
            Thread t = new Thread(new Blocked2());
            t.start();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Issuing t.interrupt");
            t.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
