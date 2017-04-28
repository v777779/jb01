package ch21.ex06.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TimeTaskThreads{

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5 ; i++) {
            exec.execute(new TimeTask());
        }
        Thread.yield(); // освободить ресурсы ???
        exec.shutdown();// запрет отправку новых задач объекту ExecutorService

    }

}
