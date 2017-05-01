package ch21.ex11.codec;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void check() {  // статический метод
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(new ExceptionThread());  // один экземпляр

    }
}
