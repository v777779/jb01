package ch21.ex11.coded;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CaptureUncaughtException {
    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
        exec.execute(new ExceptionThread2());  //  с перехватчиком
        exec.shutdown();  // то есть нормально срабатывает и без перехвата

        Time.sleep(100);
    }
}
