package ch21.ex11.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Joining {
    public static void check() {
        Sleeper sleepy = new Sleeper("Sleepy",1500);
        Sleeper grumpy = new Sleeper("Grumpy",1500);

        Joiner doopey = new Joiner("Dopey",sleepy);
        Joiner doc = new Joiner("Doc",grumpy);

        grumpy.interrupt(); // послать прерывание

        while(doopey.isAlive()) {
        }

    }
}
