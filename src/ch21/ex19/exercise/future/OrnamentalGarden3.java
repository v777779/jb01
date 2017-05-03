package ch21.ex19.exercise.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class OrnamentalGarden3 {
    public static void check() {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            List<Future> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                list.add(exec.submit(new Entrance3(i)));
            }
            TimeUnit.SECONDS.sleep(1);
            for (Future future : list) {
                future.cancel(true);
            }
            exec.shutdownNow();
            if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS)) {
                System.out.println("Some Tasks were not terminated");
            }
// все потоки остановлены
            System.out.println("Total:" + Entrance3.getTotalCount());
            System.out.println("Sum of Entrances :" + Entrance3.sumEntrances());


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        check();
    }
}
