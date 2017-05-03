package ch21.ex18.codea;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SynchronizedBlocked implements Runnable {
    public synchronized void f() {
        while (true) {
            Thread.yield(); // заблокирована всегда
        }
    }
    public SynchronizedBlocked() {  // при создании блокирующий поток
        new Thread(){
            public void run() {
                f();
            }
        }.start();
    }

    @Override
    public void run() {
        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting SynchronizedBlocked.run()");
    }
}
