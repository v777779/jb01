package ch21.ex31.codeb.sticks3;

import lib.threads.Chopstick;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class DLDPhilosophers3 {

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

        int [] idx = new int[] { 1,2,3,4,1};
        for (int i = 0; i < size ; i++) {
//            exec.execute(new Philosopher(sticks[i],sticks[(i+1)%size],i,ponder));
            exec.execute(new Philosopher3(sticks[0],sticks[idx[i]],i,ponder));
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
