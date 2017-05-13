package ch21.ex39.codec;

import lib.utils.Time;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CyclicBarrier;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CopyOnWriteSetTest {


    public static void check() {
        Random rnd = new Random();
        Set<Integer> set = new HashSet<>();
        CyclicBarrier barrier = new CyclicBarrier(2);
        System.out.println(set);

// runner
        new Thread(new Runnable() {
            @Override
            public void run() {
                Time.sleep(15);
                Set<Integer> setA = new CopyOnWriteArraySet<>(set);
                for (int i = 10; i < set.size(); i++) {
                    setA.remove(i);
                    setA.add(15+i);
                }
                try {
                    barrier.await();

                } catch (Exception e) {
                    System.out.println("interrupted");
                }
                System.out.println(setA);
            }
        }).start();


// main
        for (int i = 0; i < 25; i++) {
            set.add(rnd.nextInt(1000));
            Time.sleep(1);
        }
        try {
            barrier.await();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(set);
    }
}
