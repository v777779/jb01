package ch21.ex07.codea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d; // без оптимизации
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);

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
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));  // 1 процесс тяжелый
        for (int i = 0; i < 5; i++) {
           exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));  // 5 процессов обычные
        }
        exec.shutdown();

        while(!exec.isTerminated()){

        }
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ":" + countDown;
    }
}
