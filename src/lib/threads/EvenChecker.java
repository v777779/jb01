package lib.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class EvenChecker implements Runnable {
    private IntGenerator g;
    private final int id;

    public EvenChecker(IntGenerator g, int id) {
        this.g = g;
        this.id = id;
    }

    @Override
    public void run() {
        while (!g.isCanceled()) {
            int val = g.next();  // генерит числа до первого нечетного
            if (val % 2 != 0) {
                System.out.println("#" + id + " " + val + " not even!");
                g.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Ctrl+C to exit");

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(gp, i)); // id = i
        }
        exec.shutdown();
    }

    public static void test(IntGenerator gp) {  // 10 потоков по умолчанию
        test(gp, 10);


    }
}
