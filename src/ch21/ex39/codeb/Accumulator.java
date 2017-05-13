package ch21.ex39.codeb;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public abstract class Accumulator {
    public static long cycles = 50000L;
    private static final int N = 4; // number of Modifiers and Readers
    public static ExecutorService exec = Executors.newCachedThreadPool();//Executors.newFixedThreadPool(N * 2);
    private static CyclicBarrier barrier = new CyclicBarrier(N * 2 + 1); // все задачи плюс менеджер
    protected volatile int index = 0; //***
    protected volatile int value = 0;  //***
    protected long duration = 0;
    protected String id = "error"; // если не задано, то выдаст слово "error"
    protected final static int SIZE = 100000;
    protected static int[] preloaded = new int[SIZE+10];

    static {
        Random rnd = new Random();
        for (int i = 0; i < SIZE; i++) {
            preloaded[i] = rnd.nextInt();  // массив загружен числами
        }
    }

    public abstract void accumulate();  // читает массив и сумму в value

    public abstract long read();  // просто читает value

    private class Modifier implements Runnable {
        @Override
        public void run() {
            for (long i = 0; i < cycles; i++) {
                accumulate();
            }
            try {
                barrier.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class Reader implements Runnable {
        private long value;

        @Override
        public void run() {
            for (long i = 0; i < cycles; i++) {
                value = read();
            }
            try {
                barrier.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void timedTest() {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            exec.execute(new Modifier());  // запустить модификаторы
            exec.execute(new Reader());    // запустить считыватели
        }
        try {
            barrier.await();                // manager в головном потоке main
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        duration = System.nanoTime() - start;  // сюда когда все отстрелялись
        System.out.printf("%-14s:%14d\n", id, duration);

    }
    public static void report(Accumulator acc1, Accumulator acc2) {
        System.out.printf("%-22s: %.2f\n",acc1.id+"/"+acc2.id,
                (double)acc1.duration/(double)acc2.duration);


    }




}
