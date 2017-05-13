package ch21.ex39.codeb;

import static ch21.ex39.codeb.Accumulator.exec;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SynchronizatonComparisons {
    private static BaseLine baseLine = new BaseLine();
    private static SynchronizedTest synchTest = new SynchronizedTest();
    private static LockTest lockTest = new LockTest();
    private static AtomicTest atomicTest = new AtomicTest();

    private static void test() {
        System.out.println("============================");
        System.out.printf("%-14s:%14d\n", "Cycles", Accumulator.cycles);
        baseLine.timedTest();
        synchTest.timedTest();
        lockTest.timedTest();
        atomicTest.timedTest();
        Accumulator.report(synchTest, baseLine);
        Accumulator.report(lockTest, baseLine);
        Accumulator.report(atomicTest, baseLine);
        Accumulator.report(synchTest, lockTest);
        Accumulator.report(synchTest, atomicTest);
        Accumulator.report(lockTest, atomicTest);
    }

    public static void check() {
        int iterations =  6;
        System.out.println("Warmup");
        baseLine.timedTest();
        for (int i = 0; i < iterations; i++) {
            test();
            Accumulator.cycles *=2;
        }
        exec.shutdown(); // дождаться завершения
    }
}
