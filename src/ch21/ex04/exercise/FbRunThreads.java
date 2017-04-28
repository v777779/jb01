package ch21.ex04.exercise;

import lib.threads.FbRun;
import lib.utils.Time;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FbRunThreads {
    private static final int RANGE = 5;
    private static final int LIMIT = 5;

    private static void resetCount() {
        try {
            Field fieldCount = FbRun.class.getDeclaredField("counter");
            fieldCount.setAccessible(true);
            fieldCount.set(fieldCount, 1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static int next() {
        Random rnd = new Random();
        return rnd.nextInt(RANGE)+LIMIT;

    }
    public static void check() {
        System.out.println("ExecutorService CachedTreadPool:");
        resetCount();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5 ; i++) {
            exec.execute(new FbRun(next()));
        }
        exec.shutdown();// запрет отправку новых задач объекту ExecutorService

        System.out.println("\nExecutorService FixedTreadPool():");
        resetCount();
        exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5 ; i++) {
            exec.execute(new FbRun(next()));
        }
        exec.shutdown();// запрет отправку новых задач объекту ExecutorService

        Time.sleep(100);

        System.out.println("\nExecutorService SingleTreadPool():");
        resetCount();
        exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5 ; i++) {
            exec.execute(new FbRun(next()));
        }
        exec.shutdown();
        Time.sleep(100);
    }
}
