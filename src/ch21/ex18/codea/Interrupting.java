package ch21.ex18.codea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Interrupting {
    private static ExecutorService exec = Executors.newCachedThreadPool();

    static void test(Runnable r) throws InterruptedException {
        Future<?> f = exec.submit(r); // добавляем поток в общий пул
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Interrupting " + r.getClass().getSimpleName());
        f.cancel(true); // попытка прервать поток
        System.out.println("Interrupt sent to " + r.getClass().getSimpleName());
     //   System.out.println();
    }

    public static void check() {
        try {
            test(new SleepBlocked());

            test(new IOBlocked(System.in)); // ожидает ввода
            test(new SynchronizedBlocked());
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Aborting with System. exit(0)");
            System.exit(0);

        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

}
