package ch17.ex16.access;

import java.util.*;

/**
 * Created by V1 on 30-Mar-17.
 */
public class SlowMap3<K, V> extends AbstractMap<K, V> {

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
    public V remove(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        V oldValue = get(key);
        keys.remove(key);
        values.remove(oldValue);
        return oldValue;
    }

    @Override
    public void clear() {
        keys.clear();
        values.clear();
    }



    @Override
    public boolean isEmpty() {

        return (keys.isEmpty() && values.isEmpty());
    }

    @Override
    public Set<K> keySet() {
        Set<K> ks = new MSet<>(super.keySet(),keys,values);
        return ks;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> hSet = new LinkedHashSet<>();
        Iterator<K> ik = keys.iterator();
        Iterator<V> iv = values.iterator();

        while (ik.hasNext()) {
            hSet.add(new SlowEntry3<K, V>(ik.next(), iv.next()));
        }

        return hSet;

    }


}
