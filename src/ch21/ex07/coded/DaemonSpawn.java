package ch21.ex07.coded;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while (true) {   // просто бесконечный цикл демона
            Thread.yield();
        }
    }
}
