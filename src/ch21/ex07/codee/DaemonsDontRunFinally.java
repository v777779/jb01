package ch21.ex07.codee;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DaemonsDontRunFinally {
    public static void check() {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true); // переключить в режим Daemon
        System.out.println("a:"+t.isDaemon());
        t.start();

        Thread t2 = new Thread(new BDaemon());  // not Daemon
        System.out.println("b:"+t2.isDaemon());
        t2.start();

    }
}
