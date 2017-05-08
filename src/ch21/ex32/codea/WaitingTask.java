package ch21.ex32.codea;

import java.util.concurrent.CountDownLatch;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaitingTask implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final CountDownLatch latch;

    public WaitingTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println("Latch barrier passed for "+this);

        } catch (InterruptedException e) {
            System.out.println(this+"interrupted");
        }
    }

    @Override
    public String toString() {
        return String.format("Waiting task %-3d ", id); // первый аргумент
    }
}
