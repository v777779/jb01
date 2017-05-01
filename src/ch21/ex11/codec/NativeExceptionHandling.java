package ch21.ex11.codec;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class NativeExceptionHandling {
    public static void check() {
        try {
            ExecutorService exec = Executors.newSingleThreadExecutor();
            exec.execute(new ExceptionThread());
        } catch (Exception e) {
            System.out.println("catch: Thread Exception");
        }
    }
}
