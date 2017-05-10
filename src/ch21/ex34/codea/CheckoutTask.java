package ch21.ex34.codea;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CheckoutTask<T> implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private Pool<T> pool;

    public CheckoutTask(Pool<T> pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        try {
            T item = pool.checkOut();   // заняли
            System.out.println(this + " checked out " + item);
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println(this + " checked in " + item);
            pool.checkIn(item);         // освободили

        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println(this+ " finished");
    }

    @Override
    public String toString() {
        return "CheckoutTask " +id;
    }
}
