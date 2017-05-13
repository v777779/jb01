package ch21.ex39.codea;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SimpleMicroBenchmark {
    private static long test(Incrementable incrementable) {
        long start = System.nanoTime(); // текущее время
        for (int i = 0; i < 10000000L; i++) {
            incrementable.increment();
        }
        return System.nanoTime()-start; // время затраченное на тест
    }

    public static void check() {
        long synchTime = test(new SynchronizingTest());
        long lockTime = test(new LockingTest());
        System.out.printf("Synchronized     : %10d\n",synchTime);
        System.out.printf("Lock             : %10d\n",lockTime);
        System.out.printf("Lock/Synchronized: %.3f\n",(double)lockTime/(double)synchTime);

    }
}
