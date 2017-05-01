package ch21.ex12.codea;

import lib.utils.Time;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AttemptingLocking {
    private ReentrantLock lock = new ReentrantLock();

    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock():" + captured); // выводит захвачен Lock или нет

        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public void timed() {
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS); // попытка захвата по времени

        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        try {
            System.out.println("tryLock(2,TimeUnit.SECONDS):" + captured); // выводит захвачен Lock или нет

        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        check();
    }
    public static void check() {
        final AttemptingLocking al = new AttemptingLocking();
        al.untimed();  // захватили блокировку
        al.timed();

        new Thread() {
            {
                setDaemon(true); // блок инициализации Thread
            }

            @Override
            public void run() {
                al.lock.lock();  // заблокировать код
                System.out.println("acquired");
           }
        }.start();

        Thread.yield();

        Time.sleep(10);
        al.untimed();
        al.timed();
    }
}
