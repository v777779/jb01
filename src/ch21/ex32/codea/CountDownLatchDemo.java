package ch21.ex32.codea;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CountDownLatchDemo {
    private static final int SIZE = 10;

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(SIZE); // 10 тиков
        for (int i = 0; i < SIZE; i++) {
            exec.execute(new WaitingTask(latch));  // все 10 задач сидят  и ждут счетчика
        }
        for (int i = 0; i < SIZE; i++) {
            exec.execute(new TaskPortion(latch));
        }
        System.out.println("Launched all tasks");
        exec.shutdown();

    }
}
