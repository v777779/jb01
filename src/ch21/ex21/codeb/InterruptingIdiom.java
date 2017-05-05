package ch21.ex21.codeb;

import lib.utils.Time;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 04-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class InterruptingIdiom {

    public static void main(String[] args) {
        check(args);
    }
    public static void check(String[] args) {
        if (args.length != 1) {
            System.out.println("usage: java InterruptingIdiom delay-in-ms");
            System.out.println("delay = 1500ms  ");
            args = new String[] {"1500"};
        }

        try {
            Thread t = new Thread(new Blocked3());
            t.start();
            TimeUnit.MILLISECONDS.sleep(new Integer(args[0]));
            t.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Time.sleep(100);
    }
}
