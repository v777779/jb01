package ch17.ex16.local;

import lib.maps.MapEntry;

import java.util.*;

/**
 * Created by V1 on 30-Mar-17.
 */
public class SlowMap2<K, V> extends AbstractMap<K, V> {

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    private class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        @Override
        public Iterator<Entry<K, V>> iterator() {
            return new Iterator<Entry<K, V>>() {
                private int index = -1;

                @Override
                public boolean hasNext() {
                    return index < keys.size() -1;
                }

                @Override
                public Entry<K, V> next() {
                    index++;
                    return new MapEntry<K, V>(keys.get(index),values.get(index));
                }
// этот метод отрабатывает keyset().removaAll
                @Override
                public void remove() {
                    if (index < 0) {
                        throw new RuntimeException("catch: can't remove");
                    }
                    keys.remove(index);
                    values.remove(index);
                    System.out.print("*");
                    index--;
                }
            };
        }
        @Override
        public int size() {
            return keys.size();
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return new EntrySet();
    }

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

}
