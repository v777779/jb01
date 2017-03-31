package lib.maps;

import java.util.*;

/**
 * Created by V1 on 30-Mar-17.
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    @Override
    public V put(K key, V value) {
        V oldValue = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value); // заменить значение
        }
        return oldValue;
    }

    @Override
    public V get(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> hSet = new HashSet<>();
        Iterator<K> ik = keys.iterator();
        Iterator<V> iv = values.iterator();

        while (ik.hasNext()) {
            hSet.add(new MapEntry<K, V>(ik.next(), iv.next()));  // Simple MapEntry Used
        }

        return hSet;

    }


}
