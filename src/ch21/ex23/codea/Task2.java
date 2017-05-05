package ch21.ex23.codea;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Task2 implements Runnable {
    public static Blocker blocker = new Blocker();

    @Override
    public void run() {
        blocker.waitingCall();

    }
}
