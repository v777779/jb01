package ch21.ex39.codec;

import lib.utils.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CopyOnWriteListTest {
    public static void check() {
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        System.out.println(list);

// runner
        new Thread(new Runnable() {
            @Override
            public void run() {
                Time.sleep(15);
                List<Integer> listA = new CopyOnWriteArrayList(list);
                for (int i = 10; i < listA.size(); i++) {
                    listA.set(i, 25);
                }
                try {
                    long start;
                    System.out.println("CLDA:"+(start =System.nanoTime()));
                    countDownLatch.countDown();
                    System.out.println("CLDB:"+(System.nanoTime()-start));

                } catch (Exception e) {
                    System.out.println("interrupted");
                }
                System.out.println(listA);
            }
        }).start();


// main
        for (int i = 0; i < 25; i++) {
            list.add(rnd.nextInt(1000));
            Time.sleep(1);
        }
        try {
            long start;
            System.out.println("CLW:"+(start=System.nanoTime()));
            countDownLatch.await();
            System.out.println("CLE:"+System.nanoTime());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }




        System.out.println(list);
    }
}
