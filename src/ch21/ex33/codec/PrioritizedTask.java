package ch21.ex33.codec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PrioritizedTask implements Runnable, Comparable<PrioritizedTask> {
    private static int counter = 0;
    private final int id = counter++;
    private Random rnd = new Random();
    private final int priority;
    protected static List<PrioritizedTask> sequence = new ArrayList<>();

    public PrioritizedTask(int priority) {
        this.priority = priority;
        sequence.add(this);
    }

    @Override
    public int compareTo(PrioritizedTask o) {
        return (priority < o.priority) ? 1 :
                (priority > o.priority) ? -1 : 0;  // сокращенная форма
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
        System.out.println(this);
    }

    public String summary() {
        return "(" + id + ":" + priority + ")";
    }

    public static class EndSentinel extends PrioritizedTask {
        private ExecutorService exec;

        public EndSentinel(ExecutorService exec) {
            super(-1); // самый низкий приоритет, вызывать последним
            this.exec = exec;
        }

        @Override
        public void run() {
            int count = 0;
            for (PrioritizedTask pTask : sequence) {
                System.out.print(pTask.summary() + " ");
                if (++count % 5 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println(this + " calling shutdownNow()");
            exec.shutdownNow();
        }
    }

    @Override
    public String toString() {
        return String.format("[%-3d]", priority) +
                "Task " + id;
    }
}
