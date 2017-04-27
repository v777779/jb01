package ch21.ex01.codea;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BasicThreads {
    public static void check() {
        Thread t = new Thread(new LiftOff());
        t.start();

        System.out.println("Waiting for LiftOff");
    }
}
