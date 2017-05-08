package ch21.ex31.codeb.sticks3;

import lib.threads.Chopstick;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Philosopher3 implements Runnable {
    private Chopstick left;
    private Chopstick right;
    private final int id;
    private final int pondFactor;
    private Random rnd = new Random();

    public Philosopher3(Chopstick left, Chopstick right, int id, int pondFactor) {
        this.left = left;
        this.right = right;
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
                System.out.println(this + " ***" + "thinking");
                pause();
//                if (id == 0) {
//                    left.take(id + " left");        // InterruptedException >> catched
//                    right.take(id + " right");      // InterruptedException >> catched
//                } else {
                    right.take(id + " right");      // InterruptedException >> catched
                    left.take(id + " left");        // InterruptedException >> catched
//                }
                System.out.println(this + " " + "eating");
                pause();
                right.drop();
                left.drop();
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
