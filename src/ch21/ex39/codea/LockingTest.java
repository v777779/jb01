package ch21.ex39.codea;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LockingTest extends Incrementable {
    private Lock lock = new ReentrantLock();
    @Override
    public void increment() {
        lock.lock();
        try {
            counter++;// переменная входит в состав абстрактного класса
        }finally {
            lock.unlock();
        }
    }
}
