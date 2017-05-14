package ch21.ex40.codea;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ReaderWriterListTest {
    public ExecutorService exec = Executors.newCachedThreadPool();
    private final static int SIZE = 100;
    private static Random rnd = new Random();
    private ReaderWriterList<Integer> list =
            new ReaderWriterList<>(SIZE, 0); // размер и начальное значение

    public ReaderWriterListTest(int readers, int writers) {
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
                    list.set(i, rnd.nextInt());
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
                    list.get(i);
                    TimeUnit.MILLISECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("Reader interrupted");
            }
//            System.out.println("Reader finished, shutting down");
        }
    }

    public static void check() {
        new ReaderWriterListTest(30,1);

    }

}
