package ch21.ex21.exercise;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MatchRun implements Runnable {
    BallWait ballWait;

    public MatchRun(BallWait ballWait) {
        this.ballWait = ballWait;
    }

    private void checkNotify() {
        synchronized (ballWait) {
            ballWait.notifyAll();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Match timer started");
            TimeUnit.MILLISECONDS.sleep(1500);
            System.out.println("Match issued notifyAll()");
            checkNotify();
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println("Match issued notifyAll() again");
            synchronized (ballWait) {
                ballWait.notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("Match interrupted");

        }
        System.out.println("Match finished");
    }
}
