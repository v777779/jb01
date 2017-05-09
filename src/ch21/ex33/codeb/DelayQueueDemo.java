package ch21.ex33.codeb;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DelayQueueDemo {
    public static void check() {
        Random rnd = new Random();
        ExecutorService exec = Executors.newCachedThreadPool();
        DelayQueue<DelayedTask> queue = new DelayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.put(new DelayedTask(rnd.nextInt(1000)+100)); // от 10ms до 1000ms
        }
        exec.execute(new DelayedTaskConsumer(queue)); // запустить все задачи на отработку
        queue.add(new DelayedTask.EndSentinel(1200,exec)); // точка останова
    }
}
