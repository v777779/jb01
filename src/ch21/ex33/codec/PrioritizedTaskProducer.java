package ch21.ex33.codec;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PrioritizedTaskProducer implements Runnable {
    private Queue<Runnable> queue;
    private Random rnd = new Random();
    private ExecutorService exec;

    public PrioritizedTaskProducer(Queue<Runnable> queue,
                                   ExecutorService exec) {
        this.queue = queue;
        this.exec = exec;
    }

    @Override
    public void run() {
        try {  // очередь неограниченная, блокировки никогда не происходит
// случайные приоритеты
            for (int i = 0; i < 20; i++) {
                queue.add(new PrioritizedTask(rnd.nextInt(10))); // приоритет от 0 до 9
                Thread.yield();
            }
// высокие приоритеты
            for (int i = 0; i < 10; i++) {
                TimeUnit.MILLISECONDS.sleep(50);
                queue.add(new PrioritizedTask(10)); // приоритет от 10
            }
// добавляются задачи по нарастающему приоритету
            for (int i = 0; i < 10; i++) {
                queue.add(new PrioritizedTask(i)); // приоритет от 0 до 9
            }

            queue.add(new PrioritizedTask.EndSentinel(exec)); // приоритет -1 автоматом чтобы выполнить последним
        } catch (InterruptedException e) {
            System.out.println("PrioritizedTaskProducer interrupted");
        }
        System.out.println("Finished PrioritizedTaskProducer");
    }
}
