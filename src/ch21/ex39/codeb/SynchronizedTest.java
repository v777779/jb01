package ch21.ex39.codeb;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SynchronizedTest extends Accumulator {
    {
        id="Synchronized";
    }
    @Override
    public synchronized void accumulate() {
        value+= preloaded[index++];
        if (index >= SIZE) {
            index = 0;
        }
    }

    @Override
    public synchronized long read() {
        return value;
    }
}
