package ch21.ex17.codea;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ThreadLocalVariableHolder { // одна статическая переменная на все
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
            exec.execute(new Accessor(i)); // отдаем id
        }
        try {
            TimeUnit.MILLISECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();  // выдать прерывание всем потокам
    }

}
