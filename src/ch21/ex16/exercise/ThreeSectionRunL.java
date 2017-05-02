package ch21.ex16.exercise;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ThreeSectionRunL implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final ThreeSecBaseL tr;

    public ThreeSectionRunL(ThreeSecBaseL tr) {
        this.tr = tr;
    }

    @Override
    public void run() {
        switch(id % 3) {
            default:
            case 0:
                tr.m01(id);
                break;
            case 1:
                tr.m02(id);
                break;
            case 2:
                tr.m03(id);
                break;
        }
    }

    public static void check() {
        ThreeSectionL tr= new ThreeSectionL();    // один объект с методами блокировки
        ThreeSectionL2 tr2= new ThreeSectionL2(); // несколько объектов с методами блокировки
        ExecutorService exec = Executors.newCachedThreadPool();
        System.out.println("Run Exclusive Order:");
        for (int i = 0; i < 3; i++) {
            exec.execute(new ThreeSectionRunL(tr));
        }
        Time.sleep(100);

        System.out.println("\nRun Concurrent Order:");
        for (int i = 0; i < 3; i++) {
            exec.execute(new ThreeSectionRunL(tr2));
        }

        Time.sleep(100);

        exec.shutdown();

    }
}
