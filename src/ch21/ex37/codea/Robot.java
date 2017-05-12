package ch21.ex37.codea;

import java.util.concurrent.BrokenBarrierException;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public abstract class Robot implements Runnable {
    private RobotPool pool;
    protected Assembler assembler;
    private boolean engage = false;

    public Robot(RobotPool pool) {
        this.pool = pool;
    }

    public Robot assignAssembler(Assembler assembler) {
        this.assembler = assembler;
        return this;
    }

    public synchronized void engage() {
        engage = true;
        notifyAll();
    }

    abstract protected void performService();

    private synchronized void powerDown() throws InterruptedException {
        engage = false;
        assembler = null;
        pool.release(this);
        while (engage == false) { // added and waits
            wait();
        }
    }

    @Override
    public void run() {
        try {
            powerDown(); // adds robot to Pool
            while (!Thread.interrupted()) {
                performService();
                assembler.barrier().await();  // запуск задачи до барьера
                powerDown();
            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this + " off");
    }


    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
