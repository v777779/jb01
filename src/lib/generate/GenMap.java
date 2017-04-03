package lib.generate;

import lib.utils.IGenerator;

import java.util.*;

/**
 * Created by V1 on 3/27/2017.
 */
public class GenMap<K, V> {
    private int size;
    private IGenerator<K> genK;
    private IGenerator<V> genV;

    public GenMap() {
    }

    public GenMap(IGenerator<K> genK, IGenerator<V> genV, int size) {
        this.genK = genK;
        this.genV = genV;
        this.size = size;
    }

    public static HashMap<Integer, Integer> getInt(int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        IGenerator<Integer> genK = new GenRnd.GenInt(100);
        IGenerator<Integer> genV = new GenRnd.GenInt(100);

        for (int i = 0; i < size; i++) {
            map.put(genK.next(), genV.next());
        }
        return map;
    }

    public static Map<Integer, Integer> getInt(int mod, int size) {
        Map<Integer, Integer> map = new HashMap<>();
        IGenerator<Integer> genK = new GenRnd.GenInt(mod);
        IGenerator<Integer> genV = new GenRnd.GenInt(mod);
        for (int i = 0; i < size; i++) {
            map.put(genK.next(), genV.next());
        }
        return map;
    }

    public static HashMap<Integer, Integer> getIntSec(int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        IGenerator<Integer> genV = new GenRnd.GenInt(100);

        for (int i = 0; i < size; i++) {
            map.put(i, genV.next());
        }
        return map;
    }


    public static <K, V> Map<K, V> get(IGenerator<K> genK, IGenerator<V> genV, int size) {
        Map<K, V> map = new HashMap<K, V>();
        for (int i = 0; i < size; i++) {
            map.put(genK.next(), genV.next());
        }
        return map;
    }

}
