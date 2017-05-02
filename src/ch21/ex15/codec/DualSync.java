package ch21.ex15.codec;

import lib.utils.Time;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DualSync {
    private Object syncObject = new Object();

    public synchronized void f() {
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.print("f() ");
            Time.sleep(rnd.nextInt(5));
            Thread.yield();
        }
    }

    public void g() {
        synchronized (syncObject) {
            Random rnd = new Random();
            for (int i = 0; i < 5; i++) {
                System.out.print("g() ");
                Time.sleep(rnd.nextInt(5));

                Thread.yield();
            }
        }
    }
}
