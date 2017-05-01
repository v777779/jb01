package ch21.ex11.coded;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("handler caught "+e);
    }
}
