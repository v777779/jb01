package ch21.ex08.exercise;

import lib.threads.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MoreBasicThreadsDaemons {

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                return t;
            }
        });
        for (int i = 0; i < 10; i++) {
           exec.submit(new LiftOff());
        }
        //Time.sleep(10);
        System.out.println("LiftOff Daemons Started");
    }
}
