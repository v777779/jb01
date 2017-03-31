package lib.sets;

import java.util.*;

/**
 * Created by V1 on 30-Mar-17.
 */
public class SlowSet<K> extends AbstractSet<K> {
    private List<K> keys = new ArrayList<>();

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            private int index = -1;

            @Override
            public boolean hasNext() {
                return index < keys.size() - 1;
            }

            @Override
            public K next() {
                index++;
                return keys.get(index);
            } // next

//            @Override
//            public void remove() {   // этот метод отрабатывает keyset().removaAll
//                if (index < 0) {
//                    throw new RuntimeException("catch: can't remove");
//                }
//                keys.remove(index);
//                index--;
//                System.out.println("i.removeAll");
//
//            } //remove

        };
    } // iterator

    @Override
    public boolean add(K k) {
        if (contains(k)) {
            return false;
        }
        return keys.add(k);
    }

    @Override
    public boolean addAll(Collection<? extends K> c) {
        boolean flag = false;
        for (K k : c) {
            flag |= add(k);  //  находим повторные
        }
        return flag;
    }

    @Override
    public boolean contains(Object o) {
        return keys.contains(o);
    } //contains

    @Override
    public boolean remove(Object o) {

        return keys.remove(o);
    } // remove

    @Override
    public boolean removeAll(Collection<?> c) {
        return keys.removeAll(c);
    }

    @Override
    public void clear() {
        keys.clear();
    } //clear

    @Override
    public int size() {
        return keys.size();
    } //size

    @Override
    public boolean isEmpty() {
        return keys.isEmpty();
    }
}
