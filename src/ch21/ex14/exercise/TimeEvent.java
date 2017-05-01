package ch21.ex14.exercise;

import lib.utils.Time;

import java.util.*;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TimeEvent extends TimerTask {
    private static int counter = 0;
    private final int id = counter++;

    private long delay;

    public TimeEvent(long delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        System.out.println("#" + id + " time delay:" + delay + "  executed...");
    }


    public static void check() {
        Random rnd = new Random();
        List<Timer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Timer());
        }
        for (Timer timer : list) {
            long delay = rnd.nextInt(5000) + 500;
            timer.schedule(new TimeEvent(delay),delay);
        }

        Time.sleep(7000);
        System.out.println("Clearing timers ");
        for (Timer timer : list) {
            timer.cancel();
            System.out.print(".");
        }

    }
}
