package ch21.ex31.exercise.sticks;

import lib.threads.Chopstick;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Philosopher implements Runnable {
    private Chopstick left;
    private Chopstick right;
    private BlockingQueue<Chopstick> cqueue;
    private final int id;
    private final int pondFactor;
    private Random rnd = new Random();

    public Philosopher(BlockingQueue<Chopstick>cqueue, int id, int pondFactor) {
        this.cqueue = cqueue;
        this.id = id;
        this.pondFactor = pondFactor;
    }

    private void pause() throws InterruptedException {
        if (pondFactor == 0) {  // вылетает сразу паузы нет
            return;
        }
        TimeUnit.MILLISECONDS.sleep(rnd.nextInt(pondFactor * 250));
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(this + " " + "thinking");
                pause();
                right = cqueue.take();
                System.out.println(this+" took right "+right.name);
                left = cqueue.take();
                System.out.println(this+" took left "+left.name);
                System.out.println(this + " " + "eating w " +right.name+" "+left.name);
                pause();
                cqueue.put(right);
                cqueue.put(left);
            }
        } catch (InterruptedException e) {
            System.out.println(this + "exiting via interrupt");
        }
    }

    @Override
    public String toString() {
        return "Philosopher " + id;
    }
}
