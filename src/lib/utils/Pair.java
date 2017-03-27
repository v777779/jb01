package lib.utils;

/**
 * Created by V1 on 3/27/2017.
 */
public class Pair<K,V> {  // Class for Map IGenerator
    public final K key;    // for read only
    public final V value;  // for read only

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
