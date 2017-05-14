package lib.threads;

import lib.generate.Gen;
import lib.generate.GenRnd;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public abstract class Tester<C> {
    protected static int testReps = 1;  //10
    protected static int testCycles = 10;  //1000
    protected static int containerSize = 10;  //1000

    protected abstract C containerInitializer();
    protected abstract void startReadersAndWriters();

    protected C testContainer;
    protected String testId;
    protected int nReaders;
    protected int nWriters;
    protected long readResult = 0;  //***   sync access synchronized {putResults}
    protected long readTime = 0;    //***   sync access synchronized {putResults}
    protected long writeTime = 0;   //***

    protected CountDownLatch endLatch;
    public static ExecutorService exec = Executors.newCachedThreadPool();
    protected Integer[] writeData;

    public Tester(String testId, int nReaders, int nWriters) {
        this.testId = testId + " " + nReaders + "r " + nWriters + "w";
        this.nReaders = nReaders;
        this.nWriters = nWriters;

        writeData = Gen.getArray(Integer.class, new GenRnd.GenInt(), containerSize);

        for (int i = 0; i < testReps; i++) {
            runTest();
            readTime = 0;
            writeTime = 0;
        }
    }

    protected void runTest() {
        endLatch = new CountDownLatch((nReaders + nWriters)); // каждый из них чпокает счетчик
        testContainer = containerInitializer();
        startReadersAndWriters();
        try {
            endLatch.await(); // ожидаем countDown()
        } catch (InterruptedException e) {
            System.out.println("endLatch interrupted");
        }
        System.out.printf("%-32s %14d %14d\n", testId, readTime, writeTime);
        if (readTime != 0 && writeTime != 0) {
            System.out.printf("%-32s %14d\n", "readTime + writeTime =", readTime + writeTime);
        }
    }

    public abstract class TestTask implements Runnable {  // внутренний класс
        protected long duration;                  //*** sync access for read and write TestTask

        protected abstract void test();           // abstract
        protected abstract void putResults();     // abstract

        @Override
        public void run() {
            long startTime = System.nanoTime();
            test();
            synchronized (this) {
                duration = System.nanoTime() - startTime;  // this  duration
                putResults();                               //this  readResult, readTime
            }
            endLatch.countDown();
        }
    }

    public static void initMain(String[] args) {  // 1   10
        if (args.length > 0) {
            testReps = new Integer(args[0]);
        }
        if (args.length > 1) {
            testCycles = new Integer(args[1]);    // 10  1000
        }
        if (args.length > 0) {
            containerSize = new Integer(args[2]); // 10  1000
        }

        System.out.printf("%-32s %14s %14s\n",
                "Type", "Read time", "Write time");
    }

}
