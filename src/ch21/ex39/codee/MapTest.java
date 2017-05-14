package ch21.ex39.codee;


import lib.threads.Tester;

import java.util.Map;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public abstract class MapTest extends Tester<Map<Integer,Integer>> {   // C List<Integer>

    public MapTest(String testId, int nReaders, int nWriters) {
        super(testId, nReaders, nWriters);
    }

    class Reader extends TestTask {
        long result = 0;

        @Override //TestTask
        protected void test() {
            for (long i = 0; i < testCycles; i++) {
                for (int index = 0; index < containerSize; index++) {
                    result += testContainer.get(index);
                }
            }
        }

        @Override //TestTask
        protected void putResults() {         // blocked for TestTask
            readResult += result;
            readTime += duration;
        }
    }

    class Writer extends TestTask {
        @Override  //TestTask
        protected void test() {
            for (long i = 0; i < testCycles; i++) {
                for (int index = 0; index < containerSize; index++) {
                    testContainer.put(index, writeData[index]);
                }
            }
        }

        @Override //TestTask
        protected void putResults() {         // blocked for TestTask
            writeTime += duration;
        }
    }

    @Override  //Tester
    protected void startReadersAndWriters() {
        for (int i = 0; i < nReaders; i++) {
            exec.execute(new Reader());
        }
        for (int i = 0; i < nWriters; i++) {
            exec.execute(new Writer());
        }
    }
}
