package ch21.ex11.codee;

/**
 * Vadim Voronov
 * Created: 01-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SynchronizedEvenGenerator extends IntGenerator {
    private volatile int  currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void check() {
        EvenChecker.test(new SynchronizedEvenGenerator());  // генератор просто добавляет по 2, число потоков 10
    }
}
