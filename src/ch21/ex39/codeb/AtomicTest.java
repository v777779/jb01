package ch21.ex39.codeb;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtomicTest extends Accumulator {
    {
        id="Atomic";
    }
    private AtomicInteger index = new AtomicInteger(0); // синхронное int
    private AtomicInteger value = new AtomicInteger(0); // синхронное int
    @Override
    public void accumulate() {
        int i = index.getAndIncrement(); // index++
        value.getAndAdd(preloaded[i]);
        if (++i >= SIZE) {
            index.set(0);
        }
    }

    @Override
    public long read() {
        return value.get();
    }
}
