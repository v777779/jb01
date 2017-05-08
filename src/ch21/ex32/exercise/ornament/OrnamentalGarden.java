package ch21.ex32.exercise.ornament;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class OrnamentalGarden {
    public static void check() {
        final int COUNT = 5;
        try {
            CountDownLatch latch = new CountDownLatch(COUNT); // общее число счетчиков

            ExecutorService exec = Executors.newCachedThreadPool();
            for (int i = 0; i < COUNT; i++) {
                exec.execute(new Entrance(latch));
            }
            TimeUnit.SECONDS.sleep(3);
            Entrance.cancel(); // отрубить задачи
            exec.shutdownNow();
            latch.await(); // ожидаем завершения всех потоков
// все потоки остановлены
            System.out.println("Total:" + Entrance.getTotalCount());
            System.out.println("Sum of Entrances :" + Entrance.sumEntrances());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
