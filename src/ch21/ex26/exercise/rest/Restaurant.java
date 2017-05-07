package ch21.ex26.exercise.rest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Restaurant {
    public final MealPack mealPack = new MealPack();;
    Chef chef = new Chef(this);
    WaitPerson waitPerson = new WaitPerson(this);
    BusBoy busBoy = new BusBoy(this);
    ExecutorService exec = Executors.newCachedThreadPool();

    public Restaurant() {
        exec.execute(chef);             // запустить в работу chef
        exec.execute(waitPerson);       // запустить в работу waitPerson
        exec.execute(busBoy);
    }

    public static void check() {
        new Restaurant(); // создания объекта достаточно
    }
}
