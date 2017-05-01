package ch21.ex11.coded;

import java.util.concurrent.ThreadFactory;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HandlerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println("factory "+this + " creating new Thread");
        Thread t = new Thread(r);
        System.out.println("factory created "+t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());  // подключили перехватчик
        System.out.println("factory  eh = "+t.getUncaughtExceptionHandler());
        return t;
    }

}
