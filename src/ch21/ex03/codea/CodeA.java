package ch21.ex03.codea;

import lib.threads.LiftOff;
import lib.utils.Time;

import java.lang.reflect.Field;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 28-Apr-17.
 */
public class CodeA {
    private static void resetCount() {
        try {
            Field fieldCount = LiftOff.class.getDeclaredField("taskCount");
            fieldCount.setAccessible(true);
            fieldCount.set(fieldCount, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nThread Executor Check\n");
        System.out.println("ExecutorService CachedTreadPool():");
        CachedThreadPool.check();
        Time.sleep(100);

        System.out.println("\nExecutorService FixedTreadPool():");
        resetCount();
        FixedThreadPool.check();
        Time.sleep(100);

        System.out.println("\nExecutorService SingleTreadPool():");
        resetCount();
        SingleThreadExecutor.check();
        Time.sleep(100);

    }
}
