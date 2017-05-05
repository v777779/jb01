package ch21.ex21.codea;

/**
 * Vadim Voronov
 * Created: 04-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Blocked2 implements Runnable {
    BlockedMutex blocked = new BlockedMutex(); // заблокирован автоматом
    @Override
    public void run() {
        System.out.println("Waiting for f() in BlockedMutex");
        blocked.f1();
        System.out.println("Broken out of blocked call");
    }
}
