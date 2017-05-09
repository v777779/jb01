package ch21.ex33.codec;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PrioritizedTaskConsumer implements Runnable {
    private PriorityBlockingQueue<Runnable> queue;

    public PrioritizedTaskConsumer(PriorityBlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                queue.take().run();  //
            }
        } catch (InterruptedException e) {
            System.out.println("PrioritizedTaskConsumer interrupted");
        }
        System.out.println("Finished PrioritizedTaskConsumer");
    }
}
