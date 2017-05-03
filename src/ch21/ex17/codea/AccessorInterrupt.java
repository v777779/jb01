package ch21.ex17.codea;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AccessorInterrupt implements Runnable{
    private final int id;

    public AccessorInterrupt(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                ThreadLocalVariableHolder.increment();
                System.out.println(this);
                TimeUnit.MILLISECONDS.sleep(1);
                Thread.yield();
            }
        } catch (InterruptedException e) {
            System.out.println(this+" interrupted");
        }
        System.out.println(this+" finished");
    }

    @Override
    public String toString() {
        return "#" + id + ": "+ThreadLocalVariableHolder.get();
    }

}
