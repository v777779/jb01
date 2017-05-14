package ch21.ex39.coded;

import lib.generate.GenList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CopyOnWriteArrayListTest extends ListTest {
    public CopyOnWriteArrayListTest(int nReaders, int nWriters) {
        super("CopyOnWriteArrayListTest", nReaders, nWriters);
    }

    @Override
    List<Integer> containerInitializer() {
        return new CopyOnWriteArrayList<>(new ArrayList<>(new GenList<>(containerSize)));
    }
}
