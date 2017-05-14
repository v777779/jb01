package ch21.ex40.exercise;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ReaderWriterMapTest {
    public ExecutorService exec = Executors.newCachedThreadPool();
    private final static int SIZE = 100;
    private static Random rnd = new Random();
    private ReaderWriterMap<Integer,Integer> map =
            new ReaderWriterMap<>(SIZE); // размер карты, данные генерятся автоматом

    public ReaderWriterMapTest(int readers, int writers) {
        for (int i = 0; i < readers ; i++) {
            exec.execute(new Reader());
        }
        for (int i = 0; i < writers ; i++) {
            exec.execute(new Writer());
        }

    }

    private class Writer implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    map.set(i, rnd.nextInt());
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Writer interrupted");
            }
            System.out.println("Writer finished, shutting down");
            exec.shutdownNow();
        }
    }

    private class Reader implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    map.get(i);
                    TimeUnit.MILLISECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("Reader interrupted");
            }
        }
    }

    public static void check() {
        new ReaderWriterMapTest(30,1);

    }

}
