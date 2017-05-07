package ch21.ex30.exercise;

import lib.utils.Time;

import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PipedIO {
    public static void check() {
        BlockingQueue<Character> queue = new LinkedBlockingQueue<>();
        Sender sender = new Sender(queue);
        Receiver receiver = new Receiver(queue);
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
