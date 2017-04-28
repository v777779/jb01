package ch21.ex07.coded;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Daemons  {
    public static void check() {
        Thread d  = new Thread(new Daemon()); // головной поток порождающий 10 дочерних
        d.setDaemon(true); // объявляем его демоном
        d.start();  // запускаем
        System.out.println("d.isDaemon():"+d.isDaemon()+", ");  // и далее дочерние потоки
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
