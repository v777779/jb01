package ch17.ex36.exercise;

import java.util.Map;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 30-Mar-17.
 */
public class SlowEntryCmp<K, V> implements Map.Entry<K, V>, Comparable<SlowEntryCmp<K,V>> {
    private K key;
    private V value;

    public SlowEntryCmp(K key, V value) {
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
        return (keyHashCode ^ valueHashCode); // key XOR value
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SlowEntryCmp)) {
            return false;
        }
        SlowEntryCmp se = (SlowEntryCmp) obj;
        boolean keys, values = true;
        if (key == null) {
            keys = (se.getKey() == null);
        } else {
            keys = key.equals(se.getKey());
        }
//        if (value == null) {
//            values = (se.getValue() == null);  //
//        } else {
//            values = value.equals(se.getValue());
//        }
        return (keys && values);
    }

    @Override
    public String toString() {   // toString обязательно в Entry
        return key + "=" + value;
    }


    @Override
    public int compareTo(SlowEntryCmp<K, V> o) {
        int cmp = ((Comparable<K>)this.getKey()).compareTo(o.getKey());
        return cmp; // поиск только по ключу
//        if (cmp != 0) {
//            return cmp;
//        }
//
//        return ((Comparable<V>)this.getValue()).compareTo(o.getValue());
    }
}
