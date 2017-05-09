package ch21.ex33.codeb;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DelayedTask implements Runnable, Delayed {
    private static int counter = 0;
    private final int id = counter++;
    private final int delta;
    private final long trigger;
    protected static List<DelayedTask> sequence = new ArrayList<>();

    public DelayedTask(int delta) {  // при организации добавляет себя в очередь static
        this.delta = delta;
        this.trigger = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delta, TimeUnit.MILLISECONDS);
        sequence.add(this);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(trigger - System.nanoTime(), TimeUnit.NANOSECONDS); // возвращает в ns
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

    @Override
    public void run() {
        System.out.print(this + " ");
    }

    public String summary() {
        return "(" + id + ":" + delta + ")";
    }

    public static class EndSentinel extends DelayedTask {
        private ExecutorService exec;
        public EndSentinel(int delta, ExecutorService exec) {
            super(delta);
            this.exec = exec;
        }
        @Override
        public void run() {
            for (DelayedTask delayedTask : sequence) {
                System.out.print(delayedTask.summary()+" ");
            }
            System.out.println();
            System.out.println(this + " calling shutdownNow()");
            exec.shutdownNow();
        }
    }


    @Override
    public String toString() {
        return String.format("[%-4d] ", delta) + "Task " + id;
    }
}
