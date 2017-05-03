package ch21.ex19.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class OrnamentalGarden1 {
    public static void check() {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            for (int i = 0; i < 5; i++) {
                exec.execute(new Entrance1(i));
            }
            TimeUnit.SECONDS.sleep(1);
            exec.shutdownNow();
            if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS)) {
                System.out.println("Some Tasks were not terminated");
            }
// все потоки остановлены
            System.out.println("Total:" + Entrance1.getTotalCount());
            System.out.println("Sum of Entrances :" + Entrance1.sumEntrances());


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
