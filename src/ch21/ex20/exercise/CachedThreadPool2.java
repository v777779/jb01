package ch21.ex20.exercise;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CachedThreadPool2 {
    public static void check() { // создается объект ExecutorService
        ExecutorService exec = Executors.newCachedThreadPool();


        for (int i = 0; i < 5 ; i++) {
            exec.execute(new LiftOff2()); // запуск потоков с задачей LiftOff() Runnable
        }
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();// запрет отправку новых задач объекту ExecutorService
        Time.sleep(100);
    }                   // все задачи до shutdown() будут выполнены
}
