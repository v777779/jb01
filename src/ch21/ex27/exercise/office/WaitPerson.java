package ch21.ex27.exercise.office;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaitPerson implements Runnable {
    private Restaurant2 restaurant;
    public Lock lock = new ReentrantLock();
    public Condition cond = lock.newCondition();


    public WaitPerson(Restaurant2 restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        int lockCount = 0;
        try {
            while (!Thread.interrupted()) {  // снимает флаг
                lock.lock();  // <this>
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

                restaurant.chef.lock.lock();  // захватить объект chef
                try {
                    restaurant.meal = null;  // сбросить объект meal
                    restaurant.chef.cond.signalAll();        // оповестили всех что chef свободен
                } finally {
                    restaurant.chef.lock.unlock();
                }
            }

        } catch (InterruptedException e) {
            System.out.println("WaitPerson interrupted");
        }
    }
}
