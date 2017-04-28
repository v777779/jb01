package ch21.ex07.coded;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Daemon implements Runnable {
    private Thread[] t = new Thread[10];

    @Override
    public void run() {

        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn()); // создать поток с задачей while(true){}
            t[i].start();
            System.out.println("DaemonSpawn "+i+" started, ");
        }

        for (int i = 0; i < t.length; i++) {
            System.out.println("t["+i+"].isDaemon():"+t[i].isDaemon()+", ");
        }
        while (true) {
            Thread.yield();  // тоже улетел в бесконечный цикл
        }
    }
}
