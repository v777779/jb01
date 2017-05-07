package ch21.ex25.exercise.rest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Restaurant {
    Meal meal;
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
