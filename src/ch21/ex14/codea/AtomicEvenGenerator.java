package ch21.ex14.codea;

import lib.threads.EvenChecker;
import lib.threads.IntGenerator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtomicEvenGenerator extends IntGenerator{
    private AtomicInteger currentEvenValue = new AtomicInteger(0);
    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void check() {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
