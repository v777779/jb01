package ch17.ex36.exercise;

import java.util.*;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 30-Mar-17.
 */
public class SlowMapEntry<K, V> extends AbstractMap<K, V>  {
    private List<SlowEntryCmp<K, V>> entries = new ArrayList<>();  // список Entry

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        SlowEntryCmp<K, V> entry = new SlowEntryCmp<K, V>(key, value); // значение роли не играет

        int index = entries.indexOf(entry); // сразу индекс
        if (index >= 0) {
            oldValue = entries.get(index).getValue();
            entries.set(index, entry);
            return oldValue;
        }
        if (oldValue == null) {
            entries.add(entry);
        }
        Collections.sort(entries); // отсортировать по ключу

        return oldValue;
    }

    @Override
    public V get(Object key) {
        SlowEntryCmp<K, V> entry = new SlowEntryCmp<K, V>((K) key, null); // значение роли не играет

        int index = entries.indexOf(entry);
        if (index >= 0) {
            return entries.get(index).getValue();
        }
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> hSet = new HashSet<>();
        hSet.addAll(entries);
        return hSet;
    }


}
