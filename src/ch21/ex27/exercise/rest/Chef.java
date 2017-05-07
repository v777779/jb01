package ch21.ex27.exercise.rest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Chef implements Runnable {
    private Restaurant restaurant;
    private int count = 0;
    private Lock lock;
    private Condition cond;

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
        lock = restaurant.lock;
        cond = restaurant.condition;

    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                lock.lock();
                try {
                    while (restaurant.meal != null) {  // блюдо готово захватить объект this и ждать
                        cond.await();
                    }
                } finally {
                    lock.unlock();
                }

                if (++count >= 10) {
                    System.out.println("Out of food, closing");
                    restaurant.exec.shutdownNow(); // interrupt() >> all  отрубить все службы
                    TimeUnit.MILLISECONDS.sleep(1);
                }

                System.out.print("Order up! ");
                lock.lock();
                try {
                    restaurant.meal = new Meal(count); // подготовить блюдо
                    cond.signalAll(); // оповестить всех кто сидит в wait() по waitPerrson
                } finally {
                    lock.unlock();
                }
                TimeUnit.MILLISECONDS.sleep(100);  // за это время еда съедается
            }
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted");
        }


    }
}
