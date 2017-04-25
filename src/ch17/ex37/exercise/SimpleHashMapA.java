package ch17.ex37.exercise;

import lib.maps.MapEntry;

import java.util.*;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 31-Mar-17.
 */
public class SimpleHashMapA<K, V> extends AbstractMap<K, V> {
    static final int SIZE = 1987;
    ArrayList<MapEntry<K, V>>[] buckets = new ArrayList[SIZE]; // массив LinkedList[] базовый элемент упрощенный Set<>

    @Override
    public V put(K key, V value) {
        V oldValue = null;

        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            buckets[index] = new ArrayList<>();  // тип можно не задавать
        }
        ArrayList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);    // создать элемент хранения
        boolean found = false;
        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
        while (lit.hasNext()) {
            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                oldValue = iPair.getValue();    // старое значение запомнили
                iPair.setValue(value);          // задали новое значение
                found = true;                   // нашли элемент в HashMap
                break;
            }
        }
        if (!found) {  // не нашли
            buckets[index].add(pair);           // добавили в общую карту
        }
        return oldValue;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {   // не заполнен
            return null;                // значит значения нету выходим
        }
        ArrayList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
        while (lit.hasNext()) {
            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                return iPair.getValue();        // возвращаем значение
            }
        }
        return null;  // не нашли
    }

    @Override
    public Set<Entry<K, V>> entrySet() {  // тупо заполняем массив карты
        Set<Entry<K,V>> set = new HashSet<>();
        for (ArrayList<MapEntry<K, V>> bucket : buckets) {  // открутить все списки
            if (bucket == null) {
                continue;
            }
            for (MapEntry<K, V> entry : bucket) {  // вытащить из каждого набор элементов
                set.add(entry);
            }
        }
        return set;  // вернуть набор честных Map.Entry на базе HashSet<Map.Entry>
    }

    @Override
    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = null;
        }
    }

    @Override
    public V remove(Object key) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            return null;                // значит значения нету выходим
        }
        ArrayList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
        boolean found = false;
        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
        while (lit.hasNext()) {
            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                oldValue = iPair.getValue();    // старое значение запомнили
                lit.remove();                   // убираем этот объект
                return oldValue;
            }
        }
            return null;
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null) {
                continue;
            }
            size += buckets[i].size();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size()== 0;
    }

    @Override
    public boolean containsValue(Object value) {
        for (ArrayList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) {
                continue;
            }
            ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
            while (lit.hasNext()) {
                if (lit.next().getValue().equals(value)) {   // нашли точно такой же элемент
                    return true;                             // возвращаем значение
                }
            }
        }
        return false;  // не нашли
    }

    @Override
    public boolean containsKey(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            return false;
        }
        ArrayList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
        while (lit.hasNext()) {
            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                return true;                    // возвращаем значение
            }
        }
        return false;  // не нашли
    }

}
