package lib.maps;

import java.util.*;

/**
 * Created by V1 on 30-Mar-17.
 */
public class SlowMap2<K, V> extends AbstractMap<K, V> {

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

    private class SlowEntry<K, V> implements Entry<K, V> {
        private K key;
        private V value;

        public SlowEntry(K key, V value) {
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
            if (!(obj instanceof SlowEntry)) {
                return false;
            }
            SlowEntry se = (SlowEntry) obj;
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

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> hSet = new HashSet<>();
        Iterator<K> ik = keys.iterator();
        Iterator<V> iv = values.iterator();

        while (ik.hasNext()) {
            hSet.add(new SlowEntry<K, V>(ik.next(), iv.next()));
        }

        return hSet;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<K> ik = keys.iterator();
        Iterator<V> iv = values.iterator();
        while (ik.hasNext()) {
            sb.append(ik.next());
            sb.append('=');
            sb.append(iv.next());
            sb.append(", ");
        }
        sb.replace(sb.length()-2,sb.length(),"]\n");
        return sb.toString();
    }
}
