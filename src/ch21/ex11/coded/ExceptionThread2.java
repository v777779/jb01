package ch21.ex11.coded;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ExceptionThread2 implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by "+t);
        System.out.println("run() eh = "+t.getUncaughtExceptionHandler()+" "+t.getName());
        throw new RuntimeException("Exception from Thread"+t.getName());
    }
}
