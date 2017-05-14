package ch21.ex39.codee;


import lib.generate.GenRnd;
import lib.generate.GenSeq;
import lib.utils.MapData;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ConcurrentHashMapTest extends MapTest {
    public ConcurrentHashMapTest(int nReaders, int nWriters) {
        super("Concurrent HashMap", nReaders, nWriters);
    }

    @Override
    protected Map<Integer,Integer> containerInitializer() {
        return new ConcurrentHashMap<>(
                new HashMap<Integer,Integer>(
                        MapData.get(new GenSeq.GenInt(),new GenRnd.GenInt(),containerSize)));
    }
}
