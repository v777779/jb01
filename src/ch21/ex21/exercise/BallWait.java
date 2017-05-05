package ch21.ex21.exercise;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BallWait implements Runnable {
    private synchronized void checkWait() throws InterruptedException{
        wait();

    }

    @Override
    public void run() {
        try {
            System.out.println("Ball runnned and waits");
            checkWait();
            System.out.println("Ball waits again");
            synchronized (this) {
                wait();
            }

        } catch (InterruptedException e) {
            System.out.println("Ball interrupted..");
        }
        System.out.println("Ball exited");

    }
}
