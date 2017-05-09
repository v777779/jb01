package ch21.ex33.codea;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HorseRace {
    static final int FINISH_LINE = 15;
    private List<Horse> horses = new ArrayList<>();

    private ExecutorService exec = Executors.newCachedThreadPool();
    private CyclicBarrier barrier;

    private class HorseRun implements Runnable {
        private final int pause;

        public HorseRun(int pause) {
            this.pause = pause;
        }

        @Override
        public void run() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < FINISH_LINE; i++) {
                sb.append("=");
            }
            System.out.println(sb);
// print horse tracks
            for (Horse horse : horses) {
                System.out.println(horse.tracks());
            }
// check horse run
            for (Horse horse : horses) {
                if (horse.getStrides() >= FINISH_LINE) {
                    System.out.println(horse + "won!");
                    exec.shutdownNow(); // отрубить все потоки
                    return;
                }
            }
            try {
                TimeUnit.MILLISECONDS.sleep(pause);
            } catch (InterruptedException e) {
                System.out.println("barrier-action sleep interrupted");
            }
        }
    }

    public HorseRace(int nHorses, int pause) {
        barrier = new CyclicBarrier(nHorses, new HorseRun(pause));
        for (int i = 0; i < nHorses; i++) {
            Horse horse = new Horse(barrier);
            horses.add(horse);  // добавить в список класса
            exec.execute(horse);
        }
    }

    public static void check() {
        int nHorses = 7;
        int pause = 100;
        new HorseRace(nHorses, pause); // запуск гонок
    }

}
