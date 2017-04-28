package ch21.ex07.codeb;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {  // потоки демоны работают бесконечно.
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " >> " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }

    public static void check() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread thread = new Thread(new SimpleDaemons());
                thread.setDaemon(true); // переключить в режим демона
                thread.start();
            }

            System.out.println("All daemons started");
           TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
