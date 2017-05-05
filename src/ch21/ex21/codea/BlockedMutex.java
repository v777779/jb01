package ch21.ex21.codea;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 04-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BlockedMutex {
    private Lock lock = new ReentrantLock();

    public BlockedMutex() {  // блокируется сразу при создании объекта
        lock.lock();
    }

    public void f1() {
        try {
            lock.lockInterruptibly();
            System.out.println("lock acquired f()");  // сюда вообще не попадает
        } catch (InterruptedException e) {
            System.out.println("Interrupted from lock acquisition in f()");
        }
    }
}
