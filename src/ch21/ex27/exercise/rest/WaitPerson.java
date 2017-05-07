package ch21.ex27.exercise.rest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaitPerson implements Runnable {
    private Restaurant restaurant;
    private Lock lock;
    private Condition cond;


    public WaitPerson(Restaurant restaurant) {
        this.restaurant = restaurant;
        lock = restaurant.lock;
        cond = restaurant.condition;
    }

    @Override
    public void run() {
        int lockCount = 0;
        try {
            while (!Thread.interrupted()) {  // снимает флаг
                lock.lock();
                try {
                    while (restaurant.meal == null) {   // даже если получим signalAll все равно сидим по условию
                        lockCount++;
                       if(lockCount > 1) {
                           System.out.println("wp: real exit wait");
                       }
                        cond.await();
                        lockCount++;
                    }
                    lockCount = 0;
                } finally {
                    lock.unlock();
                }
                System.out.println("WaitPerson got " + restaurant.meal); // ну да еду получил

                lock.lock();
                try {        // захватить объект chef
                    restaurant.meal = null;             // сбросить объект meal
                    cond.signalAll();        // оповестили всех что chef свободен
                } finally {
                    lock.unlock();
                }
            }

        } catch (InterruptedException e) {
            System.out.println("WaitPerson interrupted");
        }
    }
}
