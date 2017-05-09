package ch21.ex33.codeb;

import java.util.concurrent.DelayQueue;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DelayedTaskConsumer implements Runnable {
    private DelayQueue<DelayedTask> queue;

    public DelayedTaskConsumer(DelayQueue<DelayedTask> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
              queue.take().run(); // очередь не отдаст элемент если не вышло время задержки
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("\nFinished DelayedTaskConsumer");
    }
}
