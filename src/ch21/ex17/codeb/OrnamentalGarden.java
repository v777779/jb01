package ch21.ex17.codeb;

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
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            for (int i = 0; i < 5; i++) {
                exec.execute(new Entrance(i));
            }
            TimeUnit.SECONDS.sleep(3);
            Entrance.cancel(); // отрубить задачи
            exec.shutdownNow();
            if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS)) {
                System.out.println("Some Tasks were not terminated");
            }
// все потоки остановлены
            System.out.println("Total:" + Entrance.getTotalCount());
            System.out.println("Sum of Entrances :" + Entrance.sumEntrances());


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
