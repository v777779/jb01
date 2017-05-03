package ch21.ex20.exercise.office;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CachedThreadPool3 {
    public static void check() { // создается объект ExecutorService
        ExecutorService exec = Executors.newCachedThreadPool();


        for (int i = 0; i < 5 ; i++) {
            exec.execute(new LiftOff3()); // запуск потоков с задачей LiftOff() Runnable
        }
        Thread.yield();
        exec.shutdownNow();// запрет отправку новых задач объекту ExecutorService
    }                   // все задачи до shutdown() будут выполнены
}
