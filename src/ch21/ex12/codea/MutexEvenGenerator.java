package ch21.ex12.codea;


import lib.threads.EvenChecker;
import lib.threads.IntGenerator;

import java.util.Calendar;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MutexEvenGenerator extends IntGenerator{
    private int  currentEvenValue = 0;
    private Lock lock = new ReentrantLock(); // объект Lock
    private long timeStart= Calendar.getInstance().getTimeInMillis();;

    @Override
    public int next() {
        lock.lock();                // заблокировать метод
        try {                       // только для finally
            ++currentEvenValue;
            ++currentEvenValue;
            return currentEvenValue;
        }finally {
            lock.unlock();
// сгенерить условие выброса
            if ( Calendar.getInstance().getTimeInMillis()-timeStart > 1000) {
                ++currentEvenValue;
            }
        }
    }

    public static void check() {
        EvenChecker.test(new MutexEvenGenerator());  // генератор просто добавляет по 2, число потоков 10
    }
}
