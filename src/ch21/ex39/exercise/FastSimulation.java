package ch21.ex39.exercise;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FastSimulation {
    private static final int N_ELEMENTs = 100000;
    private static final int N_GENES = 30;
    private static final int N_EVOLVERS = 50; // здоровенный массив 5млн ячеек
    private static final AtomicInteger[][] GRID = new AtomicInteger[N_ELEMENTs][N_GENES];
    private static Random rnd = new Random();

    private static class Evolver implements Runnable {
        private final int nRecords; // number of operation
        private static int counter = 0;
        private final int id = counter++;
        private CyclicBarrier barrier;

        public Evolver(int nRecords, CyclicBarrier barrier) {
            this.nRecords = nRecords;
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                int counter = 0;
                barrier.await();        // запуск когда все выйдут на точку старта
                while (!Thread.interrupted() && counter++ < nRecords) {
                    int element = rnd.nextInt(N_ELEMENTs);
                    for (int i = 0; i < N_GENES; i++) {
                        int previous = element - 1;
                        if (previous < 0) {
                            previous = N_ELEMENTs - 1;
                        }
                        int next = element + 1;
                        if (next >= N_ELEMENTs) next = 0;
                        int oldValue = GRID[element][i].get();
                        // вычисления
                        int newValue = oldValue + GRID[previous][i].get() + GRID[next][i].get();
                        newValue /= 3;
                        if (!GRID[element][i].compareAndSet(oldValue, newValue)) {
// здесь обнаруживается ошибка
//                        System.out.println("Old value changed from " + oldValue + " " + count);
//                        count = 0;
                        }
                    }
                }
                barrier.await();
            } catch (Exception e) {
                System.out.println("Evolver interrupted");
            }
        }
    }

    public static void check(int nRecords) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            CyclicBarrier barrier = new CyclicBarrier(N_EVOLVERS + 1);

            for (int i = 0; i < N_ELEMENTs; i++) {
                for (int j = 0; j < N_GENES; j++) {
                    GRID[i][j] = new AtomicInteger(rnd.nextInt(1000));
                }
            }

            long start, end;
            for (int i = 0; i < N_EVOLVERS; i++) {
                exec.execute(new Evolver(nRecords, barrier)); // процесс изменяюший базу
            }
            barrier.await(); // ждем запуска
            start = System.nanoTime();
            barrier.await(); // ждем останова
            end = System.nanoTime();
            System.out.printf("FastSimulation: %.3f ms\n", (double) (end - start) / 1e6);

            exec.shutdown(); // отключить все потоки

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
