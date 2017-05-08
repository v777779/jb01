package ch21.ex32.codea;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskPortion implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private static Random rnd = new Random();
    private final CountDownLatch latch;

    public TaskPortion(CountDownLatch latch) {
        this.latch = latch;
    }

    public void doWork() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(rnd.nextInt(1000) + 10);
        System.out.println(this + " completed");
    }

    @Override
    public void run() {
        try {
            doWork();
            latch.countDown();

        } catch (InterruptedException e) {
            System.out.println(this+"interrupted");
        }
    }

    @Override
    public String toString() {
        return String.format("%-3d ", id); // первый аргумент
    }
}
