package ch21.ex39.codef;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
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

        @Override
        public void run() {
            while (!Thread.interrupted()) {
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
                        System.out.println("Old value changed from " + oldValue);
//                        System.out.println("Old value changed from " + oldValue + " " + count);
//                        count = 0;
                    }
                }
            }
        }
    }

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < N_ELEMENTs; i++) {
            for (int j = 0; j < N_GENES; j++) {
                GRID[i][j] = new AtomicInteger(rnd.nextInt(1000));
            }
        }

        for (int i = 0; i < N_EVOLVERS; i++) {
            exec.execute(new Evolver()); // процесс изменяюший базу
        }
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow(); // отключить все потоки
    }


}
