package ch21.ex23.codea;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Blocker {

    synchronized void waitingCall() {
        try {
            while (!Thread.interrupted()) {  // бесконечный цикл ожидания с печатью по notify()
                wait(); // this объект блокировки
                System.out.println(Thread.currentThread()+" ");
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
    public synchronized void prod() {
        notify(); // по данному объекту
    }

    public synchronized void prodAll() {
        notifyAll(); // по данному объекту
    }

}
