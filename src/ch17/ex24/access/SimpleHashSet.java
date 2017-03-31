package ch17.ex24.access;

import java.util.*;

/**
 * Created by V1 on 31-Mar-17.
 */
public class SimpleHashSet<K> extends AbstractSet<K> {
    static final int SIZE = 1987;
    LinkedList<K>[] buckets = new LinkedList[SIZE]; // массив LinkedList[] базовый элемент упрощенный Set<>

    private LinkedList<K> collect() {
        LinkedList<K> list = new LinkedList<K>();
        for (LinkedList<K> bucket : buckets) {
            if (bucket == null) {
                continue;
            }
            list.addAll(bucket);
        }
        return list;
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            private int index = -1;
            private LinkedList<K> list = collect();
            @Override
            public boolean hasNext() {
                if (list.size() <= 0) {
                    return false;
                }
                return index < list.size()-1;
            }

            @Override
            public K next() {
                index++;
                return list.get(index);
            }
        };
    }

    @Override
    public boolean add(K key) {
        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            buckets[index] = new LinkedList<>();  // тип можно не задавать
        }
        LinkedList<K> bucket = buckets[index];      // получаем список под данный hashCode
        ListIterator<K> lit = bucket.listIterator();
        while (lit.hasNext()) {
            K iKey = lit.next();  // получили элемент из списка
            if (iKey.equals(key)) {   // нашли точно такой же элемент
                return false;          // если нашли, то выходим без добавления false
            }
        }
             buckets[index].add(key);  // добавили в общую карту  true
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends K> c) {
        boolean flag = false;
        for (K k : c) {
            flag |= add(k);  // если хоть один сработает, то true
        }
        return flag;
    }

    @Override
    public boolean contains(Object o) {
        K key = (K)o;
        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            return false;
        }
        LinkedList<K> bucket = buckets[index];      // получаем список под данный hashCode
        ListIterator<K> lit = bucket.listIterator();
        while (lit.hasNext()) {
            K iKey = lit.next();  // получили элемент из списка
            if (iKey.equals(key)) {   // нашли точно такой же элемент
                return true;          // если нашли, то выходим без добавления false
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        K key = (K)o;
        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            return false;
        }
        LinkedList<K> bucket = buckets[index];      // получаем список под данный hashCode
        ListIterator<K> lit = bucket.listIterator();
        while (lit.hasNext()) {
            K iKey = lit.next();  // получили элемент из списка
            if (iKey.equals(key)) {   // нашли точно такой же элемент
                lit.remove();
                return true;          // если нашли, то выходим без добавления false
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean flag = false;
        for (Object o : c) {
            flag |= remove(o);
        }
        return flag;
    }

    @Override
    public void clear() {
        buckets = new LinkedList[SIZE]; // all clear
        super.clear();
    }


    @Override
    public int size() {
        return collect().size();
    }


    @Override
    public boolean isEmpty() {
        for (LinkedList<K> bucket : buckets) {
            if (bucket != null && bucket.size() > 0 ) {
                return false;
            }
        }
        return true;
    }



//======================================
//    @Override
//    public V put(K key, V value) {
//        V oldValue = null;
//
//        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
//        if (buckets[index] == null) {  // не заполнен
//            buckets[index] = new LinkedList<>();  // тип можно не задавать
//        }
//        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
//        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);    // создать элемент хранения
//        boolean found = false;
//        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
//        while (lit.hasNext()) {
//            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
//            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
//                oldValue = iPair.getValue();    // старое значение запомнили
//                iPair.setValue(value);          // задали новое значение
//                found = true;                   // нашли элемент в HashMap
//                break;
//            }
//        }
//        if (!found) {  // не нашли
//            buckets[index].add(pair);           // добавили в общую карту
//        }
//        return oldValue;
//    }
//
//    @Override
//    public V get(Object key) {
//        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
//        if (buckets[index] == null) {   // не заполнен
//            return null;                // значит значения нету выходим
//        }
//        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
//        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
//        while (lit.hasNext()) {
//            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
//            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
//                return iPair.getValue();        // возвращаем значение
//            }
//        }
//        return null;  // не нашли
//    }
//
//    @Override
//    public Set<Entry<K, V>> entrySet() {  // тупо заполняем массив карты
//        Set<Entry<K,V>> set = new HashSet<>();
//        for (LinkedList<MapEntry<K, V>> bucket : buckets) {  // открутить все списки
//            if (bucket == null) {
//                continue;
//            }
//            for (MapEntry<K, V> entry : bucket) {  // вытащить из каждого набор элементов
//                set.add(entry);
//            }
//        }
//        return set;  // вернуть набор честных Map.Entry на базе HashSet<Map.Entry>
//    }
//
//    @Override
//    public void clear() {
//        for (int i = 0; i < buckets.length; i++) {
//            buckets[i] = null;
//        }
//    }
//
//    @Override
//    public V remove(Object key) {
//        V oldValue = null;
//        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
//        if (buckets[index] == null) {  // не заполнен
//            buckets[index] = new LinkedList<>();  // тип можно не задавать
//        }
//        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
//        boolean found = false;
//        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
//        while (lit.hasNext()) {
//            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
//            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
//                oldValue = iPair.getValue();    // старое значение запомнили
//                lit.remove();                   // убираем этот объект
//                return oldValue;
//            }
//        }
//            return null;
//    }
//
//    @Override
//    public int size() {
//        int size = 0;
//        for (int i = 0; i < buckets.length; i++) {
//            if (buckets[i] == null) {
//                continue;
//            }
//            size += buckets[i].size();
//        }
//        return size;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return size()== 0;
//    }
//
//    @Override
//    public boolean containsValue(Object value) {
//        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
//            if (bucket == null) {
//                continue;
//            }
//            ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
//            while (lit.hasNext()) {
//                if (lit.next().getValue().equals(value)) {   // нашли точно такой же элемент
//                    return true;                             // возвращаем значение
//                }
//            }
//        }
//        return false;  // не нашли
//    }
//
//    @Override
//    public boolean containsKey(Object key) {
//        int index = Math.abs(key.hashCode()) % SIZE;
//        if (buckets[index] == null) {
//            return false;
//        }
//        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
//        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
//        while (lit.hasNext()) {
//            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
//            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
//                return true;                    // возвращаем значение
//            }
//        }
//        return false;  // не нашли
//    }

}
