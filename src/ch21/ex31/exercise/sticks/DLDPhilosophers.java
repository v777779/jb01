package ch21.ex31.exercise.sticks;

import lib.threads.Chopstick;
import lib.utils.Time;

import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DLDPhilosophers {
    public static void main(String[] args) {
        check();
    }
    public static void check() {
        int ponder = 0;
        int size = 5;

        BlockingQueue<Chopstick> cqueue = new LinkedBlockingQueue<>(); // общая очередь
        ExecutorService exec = Executors.newCachedThreadPool();

        try {
            for (int i = 0; i < size; i++) {
                cqueue.put(new Chopstick("chop_" + i));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < size; i++) {
            exec.execute(new Philosopher(cqueue, i, ponder));
        }

        try {
            TimeUnit.MILLISECONDS.sleep(1000);  // 5 сек
            //      System.in.read();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        exec.shutdownNow();
        Time.sleep(100);
        System.out.println("\nConclusion: BlockingQueue does not solve the Philosophers problem ");

    }
}
