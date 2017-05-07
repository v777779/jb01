package ch21.ex27.exercise.rest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Restaurant {
    Meal meal;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    Chef chef = new Chef(this);
    WaitPerson waitPerson = new WaitPerson(this);
    ExecutorService exec = Executors.newCachedThreadPool();

    public Restaurant() {
        exec.execute(chef);             // запустить в работу chef
        exec.execute(waitPerson);       // запустить в работу waitPerson
    }

    public static void check() {
        new Restaurant(); // создания объекта достаточно
    }
}
