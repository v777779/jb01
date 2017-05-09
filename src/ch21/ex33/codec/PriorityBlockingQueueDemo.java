package ch21.ex33.codec;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PriorityBlockingQueueDemo {
    public static void check() {
        Random rnd = new Random();
        ExecutorService exec = Executors.newCachedThreadPool();
        PriorityBlockingQueue<Runnable> queue = new PriorityBlockingQueue<>();
        exec.execute(new PrioritizedTaskProducer(queue, exec));   // заполнить очередь
        exec.execute(new PrioritizedTaskConsumer(queue));       // отработать очередь

    }
}
