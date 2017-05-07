package ch21.ex30.exercise;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Receiver implements Runnable {
    private Random rnd = new Random();
    private BlockingQueue<Character> queue;

    public Receiver(BlockingQueue<Character> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Read: "+(char)queue.take()+", ");
            }
        } catch (InterruptedException e) {
            System.out.println(e + " Receiver interrupted");
        }

    }
}
