package ch21.ex33.exercise;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DelayedTask implements Delayed {
    private final long trigger;
    private Runnable runner;
    private long delta;
    private long initDelay;
    private DelayQueue<DelayedTask> queue;
    private final long time;
    private static int counter = 0;
    private final int id = counter++;


    public DelayedTask(Runnable runner, long delta) {  // при организации добавляет себя в очередь static
        this.runner = runner;
        this.delta = delta;
        initDelay = 0;
        this.trigger = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delta, TimeUnit.MILLISECONDS);
        this.time = System.nanoTime();
    }

    public DelayedTask(Runnable runner, long initDelay, long period, DelayQueue<DelayedTask> queue) {  // повторяющийся цикл
        this.runner = runner;
        this.initDelay = initDelay;  // начальная пауза
        this.delta = period;
        this.trigger = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delta, TimeUnit.MILLISECONDS);
        this.time = System.nanoTime();
        this.queue = queue;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(trigger - System.nanoTime(), TimeUnit.NANOSECONDS);// возвращает в ns
    }

    @Override
    public int compareTo(Delayed o) {
        DelayedTask that = (DelayedTask) o;
        if (trigger < that.trigger) {
            return -1;
        }
        if (trigger > that.trigger) {
            return 1;
        }

        return 0;
    }

    public void run() {  // запустить задачу через время задержки
        try {
            if (queue == null) {
                runner.run();
            } else {
                TimeUnit.MILLISECONDS.sleep(initDelay); // начальная задержка}
                runner.run();
                queue.put(new DelayedTask(runner, initDelay, delta, queue)); // поставить заново в очередь
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }

}


