package ch21.ex40.exercise;

import lib.generate.GenRnd;
import lib.generate.GenSeq;
import lib.utils.MapData;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ReaderWriterMap<K,V> {
    private HashMap<K,V> lockedMap;
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

    public ReaderWriterMap(int size) {
        this.lockedMap = new HashMap<K, V>((Map)MapData.get(new GenSeq.GenInt(),new GenRnd.GenInt(),size));

    }

    public  V set(K key, V value) {
        Lock wlock = lock.writeLock(); // новый writeLock на запись
        wlock.lock();
        try {
            return lockedMap.put(key,value);
        } finally {
            wlock.unlock();
        }
    }

    public V get(K key) {
        Lock rlock = lock.readLock(); // новый readLock на запись
        rlock.lock();
        try {
            if (lock.getReadLockCount() > 1) {
                System.out.println(lock.getReadLockCount()); // несколько задач получают readLock()
            }
            return lockedMap.get(key);
        } finally {
            rlock.unlock();
        }
    }

}
