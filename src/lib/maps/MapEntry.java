package lib.maps;

import java.util.Map;

/**
 * Created by V1 on 30-Mar-17.
 */
public class MapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    @Override
    public int hashCode() {
        int keyHashCode = (key == null) ? 0 : key.hashCode();       // берем реализацию у ключа
        int valueHashCode = (value == null) ? 0 : value.hashCode();// берем реализацию у значения
        return (keyHashCode ^ valueHashCode); // key XOR codeg
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MapEntry)) {
            return false;
        }
        MapEntry se = (MapEntry) obj;
        boolean keys, values;
        if (key == null) {
            keys = (se.getKey() == null);
        } else {
            keys = key.equals(se.getKey());
        }
        if (value == null) {
            values = (se.getValue() == null);  //
        } else {
            values = value.equals(se.getValue());
        }
        return (keys && values);
    }

    @Override
    public String toString() {   // toString обязательно в Entry
        return key + "=" + value;
    }
}
