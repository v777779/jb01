package ch17.ex16.access;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created by V1 on 30-Mar-17.
 */
public class MSet<K, V> extends HashSet<K> {
    private List<K> keys;
    private List<V> values;

    public MSet(List<K> keys, List<V> values) {
        this.keys = keys;
        this.values = values;
    }

    public MSet(Collection<? extends K> c, List<K> keys, List<V> values) {
        super(c);
        this.keys = keys;
        this.values = values;
    }

    @Override
    public boolean removeAll(Collection<?> c) {  // по ключу
        boolean flag = false;
        for (Object o : c) {
            if (keys.contains(o)) {
                int index = keys.indexOf(o);
                values.remove(index);
                keys.remove(index);
                flag = true;
            }
        }

        return flag;
    }


    public List<K> getKeys() {
        return keys;
    }

    public void setKeys(List<K> keys) {
        this.keys = keys;
    }

    public List<V> getValues() {
        return values;
    }

    public void setValues(List<V> values) {
        this.values = values;
    }
}
