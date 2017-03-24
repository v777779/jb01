package lib.pets;

/**
 * Created by V1 on 16.03.2017.
 */
public class Pair<K,V> {
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
