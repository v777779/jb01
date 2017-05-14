package ch21.ex39.exercise;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LongSimulation {
    private static final int N_ELEMENTs = 100000;
    private static final int N_GENES = 30;
    private static final int N_EVOLVERS = 50; // здоровенный массив 5млн ячеек
    private static int[][] GRID = new int[N_ELEMENTs][N_GENES];
    private static Random rnd = new Random();


    private static class Evolver implements Runnable {
        private Lock lock = new ReentrantLock();
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
                barrier.await();

                while (!Thread.interrupted() && counter++ < nRecords) {
                    int element = rnd.nextInt(N_ELEMENTs);
                    for (int i = 0; i < N_GENES; i++) {
                        int previous = element - 1;
                        if (previous < 0) {
                            previous = N_ELEMENTs - 1;
                        }
                        int next = element + 1;
                        if (next >= N_ELEMENTs) next = 0;
                        lock.lock();
                        try {
                            // вычисления
                            int newValue = GRID[element][i] + GRID[previous][i] + GRID[next][i];
                            newValue /= 3;
                            GRID[element][i] = newValue;
                        } finally {
                            lock.unlock();
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
                    GRID[i][j] = rnd.nextInt(1000);
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
            System.out.printf("LongSimulation: %.3f ms\n", (double) (end - start) / 1e6);

            exec.shutdown(); // отключить все потоки

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
