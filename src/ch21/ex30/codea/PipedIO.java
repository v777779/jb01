package ch21.ex30.codea;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PipedIO {
    public static void check() {
        Sender sender = new Sender();
        Receiver receiver = new Receiver(sender);
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(sender);
        exec.execute(receiver);
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();
        Time.sleep(100);

    }
}
