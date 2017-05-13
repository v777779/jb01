package ch21.ex39.codec;

import lib.utils.Time;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ConcurrentMap {


    public static void check() {
        Random rnd = new Random();
        Map<Integer,Integer> hMap = new HashMap<>();
        CyclicBarrier barrier = new CyclicBarrier(2);
        System.out.println(hMap);

// runner
        new Thread(new Runnable() {
            @Override
            public void run() {
                Time.sleep(15);
                Map<Integer,Integer> hMapA = new ConcurrentHashMap<>(hMap); // новую карту
                for (int i = 10; i < hMapA.size(); i++) {
                    hMapA.put(i,15+i);
                }
                try {
                    barrier.await();

                } catch (Exception e) {
                    System.out.println("interrupted");
                }
                System.out.println(hMapA);
            }
        }).start();


// main
        for (int i = 0; i < 25; i++) {
            hMap.put(i,rnd.nextInt(1000));
            Time.sleep(1);
        }
        try {
            barrier.await();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(hMap);
    }
}
