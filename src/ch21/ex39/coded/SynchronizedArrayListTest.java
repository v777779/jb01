package ch21.ex39.coded;

import lib.generate.GenList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SynchronizedArrayListTest extends ListTest {
    public SynchronizedArrayListTest(int nReaders, int nWriters) {
        super("Synchronized ArrayList", nReaders, nWriters);
    }

    @Override
    List<Integer> containerInitializer() {
        return Collections.synchronizedList(new ArrayList<Integer>(new GenList<Integer>(containerSize)));
    }
}
