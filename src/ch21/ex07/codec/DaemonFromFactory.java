package ch21.ex07.codec;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DaemonFromFactory implements Runnable {
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
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory()); //создать пул из Factory
        for (int i = 0; i < 10; i++) {
            exec.execute(new DaemonFromFactory());
        }

        try {
            System.out.println("All daemons started");
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdown();

//        whi1le (!exec.isTerminated()) {  // крутит демоны бесконечно
//
//        }
    }

}
