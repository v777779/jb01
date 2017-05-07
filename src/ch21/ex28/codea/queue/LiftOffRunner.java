package ch21.ex28.codea.queue;

import lib.threads.LiftOff;

import java.util.concurrent.BlockingQueue;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LiftOffRunner implements Runnable {
    private BlockingQueue<LiftOff> rockets;

    public LiftOffRunner(BlockingQueue<LiftOff> rockets) {
        this.rockets = rockets;
    }

    public void add(LiftOff liftOff) {
        try {
            rockets.put(liftOff);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }


    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {  // попутно сбрасываем флаг прерывания
                LiftOff rocket = rockets.take();    // взять из очереди   подвешивает если нет объекта
                rocket.run();                       // запустить элемент в потоке
            }
        } catch (InterruptedException e) {
            System.out.println("Waking from take()");
        }
        System.out.println("Exiting LiftOffRunner");
    }
}
