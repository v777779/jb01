package ch21.ex09.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SimplePrioritiesUser implements Runnable {
    private int countDown = 5;
    private volatile double d; // без оптимизации
    private int priority;

    @Override
    public void run() {
            while (true) {
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    Thread.yield();  // сделано чтобы высокоприоритетный поток все таки дал другим выполниться
                }
            }
            System.out.println(this);  // повторить 5 раз полный цикл
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool(new PriorityThreadFactory(Thread.MIN_PRIORITY));

        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePrioritiesUser());
        }
        Thread.yield();
        exec.shutdown();

        exec =  Executors.newCachedThreadPool(new PriorityThreadFactory(Thread.MAX_PRIORITY));
        exec.execute(new SimplePrioritiesUser());
        Thread.yield();
        exec.shutdown();

        while(!exec.isTerminated()){

        }
    }

    @Override
    public String toString() {
        Thread t = Thread.currentThread();
        ThreadGroup g = t.getThreadGroup();
        //return Thread.currentThread() + ":" + countDown;
        return "Thread[" + t.getName() + " p:" + t.getPriority() + " g:" +
                g.getName() + "]"+":"+countDown;

    }
}
