package ch17.ex21.access;

import lib.maps.MapEntry;

import java.util.*;

/**
 * Created by V1 on 31-Mar-17.
 */
public class SimpleHashMapD<K, V> extends AbstractMap<K, V> {
    static final int SIZE = 1987;
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE]; // массив LinkedList[] базовый элемент упрощенный Set<>

    @Override
    public int size() {
        return super.size();
    }


    @Override
    public V put(K key, V value) {
        V oldValue = null;

        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            buckets[index] = new LinkedList<>();  // тип можно не задавать
        }


        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);    // создать элемент хранения
        boolean found = false;
        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();

        int probes = 0;
        while (lit.hasNext()) {
            probes++;
            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                oldValue = iPair.getValue();    // старое значение запомнили
                iPair.setValue(value);          // задали новое значение
                found = true;                   // нашли элемент в HashMap
                System.out.printf("collision old:%-25s new:%-25s  probes:%-2d\n", pair, iPair,probes);
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
        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
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
        Set<Entry<K, V>> set = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {  // открутить все списки
            if (bucket == null) {
                continue;
            }
            for (MapEntry<K, V> entry : bucket) {  // вытащить из каждого набор элементов
                set.add(entry);
            }
        }
        return set;  // вернуть набор честных Map.Entry на базе HashSet<Map.Entry>
    }
}
