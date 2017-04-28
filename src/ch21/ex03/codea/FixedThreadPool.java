package ch21.ex03.codea;

import lib.threads.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FixedThreadPool {
    public static void check() { // создается объект ExecutorService
        ExecutorService exec = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 5 ; i++) {
            exec.execute(new LiftOff()); // запуск потоков с задачей LiftOff() Runnable
        }
        exec.shutdown();// запрет отправку новых задач объекту ExecutorService
    }                   // все задачи до shutdown() будут выполнены
}
