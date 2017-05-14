package ch21.ex39.coded;

import java.util.List;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public abstract class ListTest extends Tester<List<Integer>> {   // C List<Integer>

    public ListTest(String testId, int nReaders, int nWriters) {
        super(testId, nReaders, nWriters);
    }

    class Reader extends TestTask {
        long result = 0;

        @Override
        void test() {
            for (long i = 0; i < testCycles; i++) {
                for (int index = 0; index < containerSize; index++) {
                    result += testContainer.get(index);
                }
            }
        }

        @Override
        void putResults() {         // blocked for TestTask
            readResult += result;
            readTime += duration;
        }
    }

    class Writer extends TestTask {
        @Override
        void test() {
            for (long i = 0; i < testCycles; i++) {
                for (int index = 0; index < containerSize; index++) {
                    testContainer.set(index, writeData[index]);
                }
            }
        }

        @Override
        void putResults() {         // blocked for TestTask
            writeTime += duration;
        }
    }

    @Override
    void startReadersAndWriters() {
        for (int i = 0; i < nReaders; i++) {
            exec.execute(new Reader());
        }
        for (int i = 0; i < nWriters; i++) {
            exec.execute(new Writer());
        }
    }
}
