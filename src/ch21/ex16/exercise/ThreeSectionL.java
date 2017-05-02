package ch21.ex16.exercise;

import lib.utils.Time;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ThreeSectionL extends ThreeSecBaseL {
    Lock syncObject = new ReentrantLock();

    public void m01(int id) {
        syncObject.lock();
        try {
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                System.out.print("#" + id + "." + i + " ");
                Time.sleep(rnd.nextInt(5));
            }
            System.out.println();
        } finally {
            syncObject.unlock();
        }
    }

    public void m02(int id) {
        syncObject.lock();
        try {
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                System.out.print("#" + id + "." + i + " ");
                Time.sleep(rnd.nextInt(5));
            }
            System.out.println();
        } finally {
            syncObject.unlock();
        }
    }

    public void m03(int id) {
        syncObject.lock();
        try {
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                System.out.print("#" + id + "." + i + " ");
                Time.sleep(rnd.nextInt(5));
            }
            System.out.println();
        } finally {
            syncObject.unlock();
        }
    }
}
