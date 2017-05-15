package ch21.ex27.codea.car2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Car2 {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean waxOn = false;

    public void waxed() {
        lock.lock();        // замена synchronized
        try {
            waxOn = true;  // сообщение можно передать по объекту
            condition.signalAll(); //замена  notifyAll();
        } finally {
            lock.unlock();
        }
    }

    public void buffed() {  // синхронизированный метод
        lock.lock();        // замена synchronized
        try {
            waxOn = false;
            condition.signalAll(); //замена notifyAll();
        } finally {
            lock.unlock();
        }
    }

    public void waitForWaxing() throws InterruptedException {  // синхронизированный метод
        lock.lock();        // замена synchronized
        try {
            while (waxOn == false) {  // постоянно вызываем эту команду  ОБЯЗАТЕЛЬНО
                condition.await();// замена wait();
            }
        } finally {
            lock.unlock();
        }
    }

    public void waitForBuffing() throws InterruptedException {  // синхронизированный метод
        lock.lock();        // замена synchronized
        try {
            while (waxOn == true) {  // постоянно вызываем эту команду  ОБЯЗАТЕЛЬНО
                condition.await();// wait();
            }
        } finally {
            lock.unlock();
        }
    }


}
