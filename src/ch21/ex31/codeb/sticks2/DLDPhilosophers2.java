package ch21.ex31.codeb.sticks2;

import lib.threads.Chopstick;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DLDPhilosophers2 {
    public static void main(String[] args) {
        check();
    }
    public static void check() {
        int ponder = 0;
        int size = 5;
        ExecutorService exec = Executors.newCachedThreadPool();
        Chopstick[] sticks = new Chopstick[size];
        for (int i = 0; i <sticks.length ; i++) {
            sticks[i] = new Chopstick("chop_"+i);
        }

        for (int i = 0; i < size ; i++) {
            exec.execute(new Philosopher2(sticks[i],sticks[(i+1)%size],i,ponder));
        }

        try {
            TimeUnit.MILLISECONDS.sleep(1000);  // 5 сек
      //      System.in.read();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        exec.shutdownNow();
    }

}
