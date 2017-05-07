package ch21.ex28.exercise.queue;

import lib.threads.LiftOff;

import java.util.concurrent.BlockingQueue;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LiftOffFiller implements Runnable {
    private BlockingQueue<LiftOff> rockets;

    public LiftOffFiller(BlockingQueue<LiftOff> rockets) {
        this.rockets = rockets;
    }

    public void add(LiftOff liftOff) throws InterruptedException {
            rockets.put(liftOff);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                add(new LiftOff());
            }
        } catch (InterruptedException e) {
            System.out.println("Waking from take()");
        }
        System.out.println("Exiting LiftOffFiller");
    }
}
