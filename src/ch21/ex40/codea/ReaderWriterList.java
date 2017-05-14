package ch21.ex40.codea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ReaderWriterList<T> {  // класс List  с блокировкой
    private ArrayList<T> lockedList;
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

    public ReaderWriterList(int size, T initValue) {
        this.lockedList = new ArrayList<T>(Collections.nCopies(size, initValue));
    }

    public T set(int index, T element) {
        Lock wlock = lock.writeLock(); // новый writeLock на запись
        wlock.lock();
        try {
            return lockedList.set(index, element);
        } finally {
            wlock.unlock();
        }
    }

    public T get(int index) {
        Lock rlock = lock.readLock(); // новый readLock на запись
        rlock.lock();
        try {
            if (lock.getReadLockCount() > 1) {
                System.out.println(lock.getReadLockCount()); // несколько задач получают readLock()
            }
            return lockedList.get(index);
        } finally {
            rlock.unlock();
        }
    }


}
