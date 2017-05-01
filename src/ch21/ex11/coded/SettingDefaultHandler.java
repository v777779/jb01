package ch21.ex11.coded;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SettingDefaultHandler {
    public static void check() {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler()); // обработчик по умолчанию
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new ExceptionThread2());
        }
        exec.shutdown();
        Time.sleep(100);
    }

}
