package ch21.ex15.codeb;

import lib.threads.Pair;
import lib.threads.PairManager;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ExplicitPairManager1 extends PairManager {
    private Lock lock = new ReentrantLock();

    @Override
    public Pair getPair() {
        lock.lock();
        try {
            return new Pair(p.getX(), p.getY()); // создается копия
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void increment() {  // делается синхронным явно при помощи объекта Lock
        lock.lock();
        try {
            p.incrementX();
            p.incrementY();
            store(getPair());  // инкрементируем и сохраняем копию в список
        } finally {
            lock.unlock();
        }
    }
}
