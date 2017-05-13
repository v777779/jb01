package ch21.ex39.codec;

import lib.utils.Time;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CyclicBarrier;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ConcurrentQueue {


    public static void check() {
        Random rnd = new Random();
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        CyclicBarrier barrier = new CyclicBarrier(2);
        System.out.println(queue);

// runner
        new Thread(new Runnable() {
            @Override
            public void run() {
                Time.sleep(15);
                Queue<Integer> queueA = new ConcurrentLinkedQueue<>(queue); // новую карту
                for (int i = 10; i < queueA.size(); i++) {
                    queueA.remove();
                    queueA.add(15+i);
                }
                try {
                    barrier.await();
                } catch (Exception e) {
                    System.out.println("interrupted");
                }
                System.out.println(queueA);
            }
        }).start();


// main
        for (int i = 0; i < 25; i++) {

            queue.add(rnd.nextInt(1000));
            Time.sleep(1);
        }
        try {
            barrier.await();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(queue);
    }
}
