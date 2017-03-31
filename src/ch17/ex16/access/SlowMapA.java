package ch17.ex16.access;

import lib.maps.MapEntry;

import java.util.*;

/**
 * Created by V1 on 30-Mar-17.
 */
public class SlowMapA<K, V> extends AbstractMap<K, V> {

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
        Set<K> ks = new MapSet<>(super.keySet(),keys,values);
        return ks;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> mSet = new MapSet(keys,values);
        Iterator<K> ik = keys.iterator();
        Iterator<V> iv = values.iterator();

        while (ik.hasNext()) {
            mSet.add(new MapEntry<K, V>(ik.next(), iv.next()));
        }

        return mSet;

    }


}
