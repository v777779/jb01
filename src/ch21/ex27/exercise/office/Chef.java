package ch21.ex27.exercise.office;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Chef implements Runnable {
    private Restaurant2 restaurant;
    private int count = 0;
    public Lock lock = new ReentrantLock();
    public Condition cond = lock.newCondition();

    public Chef(Restaurant2 restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                lock.lock();  // this
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
                restaurant.waitPerson.lock.lock();  // захватить waitPerson
                try {
                    restaurant.meal = new Meal(count); // подготовить блюдо
                    restaurant.waitPerson.cond.signalAll(); // кого блокируем того и оповестить
                } finally {
                    restaurant.waitPerson.lock.unlock();
                }
                TimeUnit.MILLISECONDS.sleep(100);  // за это время еда съедается
            }
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted");
        }


    }
}
