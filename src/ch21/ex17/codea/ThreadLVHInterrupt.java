package ch21.ex17.codea;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ThreadLVHInterrupt { // одна статическая переменная на все
    private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        private Random rnd = new Random();

        @Override
        protected synchronized Integer initialValue() {
            return rnd.nextInt(1000);
        }

    };

    public static void increment() {
        value.set(value.get() + 1);
    }

    public static int get() {  // авто распаковка
        return value.get();
    }

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new AccessorInterrupt(i)); // отдаем id
        }
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();  // выдать прерывание всем потокам
    }

    public static void checkWithInterrupt() {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(exec.submit(new AccessorInterrupt(i))); // отдаем id
        }

        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // принудительно прерываем
        for (Future future : list) {
            future.cancel(true);
        }
        exec.shutdownNow();
    }

}
