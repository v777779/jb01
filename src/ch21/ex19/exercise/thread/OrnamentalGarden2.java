package ch21.ex19.exercise.thread;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class OrnamentalGarden2 {
    public static void check() {
        try {
            for (int i = 0; i < 5; i++) {
                new Entrance2(i);
            }
            TimeUnit.SECONDS.sleep(1);
            Entrance2.cancel();
            TimeUnit.MILLISECONDS.sleep(250);
// все потоки остановлены
            System.out.println("Total:" + Entrance2.getTotalCount());
            System.out.println("Sum of Entrances :" + Entrance2.sumEntrances());


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
