package lib.swing.threads;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 24-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Task implements Runnable {
    private static int counter = 0;
    private final int id = counter++;

    @Override
    public void run() {
        System.out.println(this + " started");
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
            return;
        }
        System.out.println(this + " completed");
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Task " + id;
    }
}
