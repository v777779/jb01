package ch21.ex42.exercise.car;

import lib.utils.Time;

import java.util.List;
import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaxOMatic {
    private ExecutorService exec = Executors.newSingleThreadExecutor();

    public Future<?> callWaxOn(Car car) {
        return exec.submit(new WaxOn(car));
    }

    public Future<?> callWaxOff(Car car) {
        return exec.submit(new WaxOff(car));
    }

    public void shutdown() {
        exec.shutdownNow();
    }

    public static void main(String[] args) {
        check();
    }

    public static void check() {
        List<Future<?>> list = new CopyOnWriteArrayList<>();
        Car car = new Car();
        WaxOMatic wm = new WaxOMatic();
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                label:
                while (!Thread.interrupted()) {
                    list.add(wm.callWaxOn(car));
                    list.add(wm.callWaxOff(car));
                    //stack protection
                    if(list.size()>10)
                    while (list.size() > 0) {
                        for (Future<?> future : list) {
                            if (future.isDone()) {
                                list.remove(future);
                            }
                        }
                    }
                }
                wm.shutdown();
                System.out.println("WaxOMatic interrupted");
            }
        });
        t.start();
        Time.sleep(5000);
        t.interrupt();

    }
}
