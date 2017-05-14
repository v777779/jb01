package ch21.ex39.codee;


import lib.generate.*;
import lib.utils.MapData;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SynchronizedHashMapTest extends MapTest {
    public SynchronizedHashMapTest(int nReaders, int nWriters) {
        super("Synchronized HashMap", nReaders, nWriters);
    }

    @Override
    protected Map<Integer,Integer> containerInitializer() {
        return Collections.synchronizedMap(
                new HashMap<Integer,Integer>(
                        MapData.get(new GenSeq.GenInt(),new GenRnd.GenInt(),containerSize)));
    }
}
