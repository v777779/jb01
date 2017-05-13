package ch21.ex39.coded;

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
    static int testReps = 10;
    static int testCycles = 1000;
    static int containerSize = 1000;
    abstract C containerInitializer();
    abstract void startReadersAndWriters();
    protected C tectContainer;
    protected String testId;
    protected int nReaders;
    protected int nWriters;
    protected long readResult = 0; //***
    protected long readTime = 0; //***
    protected long writeTime = 0; //***

    protected CountDownLatch endLatch;
    public static ExecutorService exec = Executors.newCachedThreadPool();
    Integer[] writeData;

    public Tester(String testId, int nReaders, int nWriters) {
        this.testId = testId+" "+nReaders+"r "+nWriters+"w";
        this.nReaders = nReaders;
        this.nWriters = nWriters;

        writeData = Gen.getArray(Integer.class, new GenRnd.GenInt(),containerSize);

        for (int i = 0; i < testReps; i++) {
            runTest();
            readTime = 0;
            writeTime = 0;
        }
    }

    protected void runTest() {
        endLatch = new CountDownLatch((nReaders+nWriters)); // каждый из них чпокает счетчик
    }


}
