package ch21.ex07.exercise;

import ch21.ex07.coded.Daemon;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Daemons2 {
    public static void check(int timeDelay) {
        Thread d  = new Thread(new Daemon2()); // головной поток порождающий 10 дочерних
        d.setDaemon(true); // объявляем его демоном
        d.start();  // запускаем
        System.out.println("d.isDaemon():"+d.isDaemon()+", ");  // и далее дочерние потоки
        try {
            TimeUnit.MILLISECONDS.sleep(timeDelay);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
