package ch21.ex06.exercise;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TimeTask implements Runnable{
    private static int counter = 0;
    private final int id = counter++;
    private Random rnd = new Random();

    @Override
    public void run() {
     long timeValue = rnd.nextInt(10)+1;
        try {
            TimeUnit.SECONDS.sleep(timeValue);

        } catch (InterruptedException e) {
            System.err.println("#"+id+" interrupted");
            return;
        }
        System.out.println("#"+id+" time delay:"+timeValue+" sec");

    }
}
