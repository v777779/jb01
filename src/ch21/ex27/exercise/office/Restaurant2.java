package ch21.ex27.exercise.office;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Restaurant2 {
    Meal meal;
    Chef chef = new Chef(this);
    WaitPerson waitPerson = new WaitPerson(this);
    ExecutorService exec = Executors.newCachedThreadPool();

    public Restaurant2() {
        exec.execute(chef);             // запустить в работу chef
        exec.execute(waitPerson);       // запустить в работу waitPerson
    }

    public static void check() {
        new Restaurant2(); // создания объекта достаточно
    }
}
