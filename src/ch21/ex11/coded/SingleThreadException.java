package ch21.ex11.coded;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SingleThreadException {
    public static void check() {
        Thread t = new Thread(new ExceptionThread2());
        t.setUncaughtExceptionHandler(new SingleThreadExceptionHandler());
        t.start();
    }
}
