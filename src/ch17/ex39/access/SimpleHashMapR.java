package ch17.ex39.access;

import lib.maps.MapEntry;

import java.util.*;

/**
 * Created by V1 on 31-Mar-17.
 */
public class SimpleHashMapR<K, V> extends AbstractMap<K, V> {
    private int capacity = 16;
    private int maxSize = 12;
    private int size = 0;

    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[capacity]; // массив LinkedList[] базовый элемент упрощенный Set<>


    private int getNearSimple(int newSize) {
        int j = 1;
        if (newSize % 2 == 0) {
            newSize++;
        }
        while (true) {  // ищем простое число
            j++;  // 2,3,4
            if ((j * j - 1) > newSize) { // слишком большой делитель
                return newSize;
            }
            if (newSize % j == 0) {
                newSize += 2;  // нечетные
                j = 1;

                continue;
            }
        }
    }

    public void rehash() {
        if (size < maxSize) {  // уходим
            return;
        }
        if (size < maxSize) {
            System.out.println("collision");
        }
// нужен reHash
        int newSize = getNearSimple(capacity * 2);
        capacity = newSize;
        maxSize = (int) (0.75 * newSize);

        LinkedList<MapEntry<K, V>>[] oldBuckets = buckets;
        buckets = new LinkedList[newSize];

        for (LinkedList<MapEntry<K, V>> bucket : oldBuckets) {
            if (bucket == null) {
                continue;
            }
            ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
            while (lit.hasNext()) {
                MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
//                putHash(iPair);
                int index = Math.abs(iPair.getKey().hashCode()) % capacity; // hachCode()
                if (buckets[index] == null) {  // не заполнен
                    buckets[index] = new LinkedList<>();  // тип можно не задавать
                }
                buckets[index].add(iPair);           // добавили в общую карту
                size++;
            }
        }
    }

    public double load() {
        double factor = (double) size() / capacity;
        return factor;
    }

    public double capacity() {
        return capacity;
    }

    public void putHash(MapEntry<K, V> pair) {
        K key = pair.getKey();
        int index = Math.abs(key.hashCode()) % capacity; // hachCode()
        if (buckets[index] == null) {  // не заполнен
            buckets[index] = new LinkedList<>();  // тип можно не задавать
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
        boolean found = false;
        ListIterator<MapEntry<K, V>> lit = bucket.listIterator();
        while (lit.hasNext()) {
            MapEntry<K, V> iPair = lit.next();  // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                throw new RuntimeException("catch: Exception Rehash collision");
            }
        }
        if (!found) {  // не нашли
            buckets[index].add(pair);           // добавили в общую карту
            size++;
        }
    }


    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % capacity; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            buckets[index] = new LinkedList<>();  // тип можно не задавать
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
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
            size++;
        }
        rehash();  // вызываем каждый раз
        return oldValue;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % capacity; // hachCode() реализуется в классе хранения обрезается по SIZE
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

    @Override
    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = null;
        }
        size = 0;
    }

    @Override
    public V remove(Object key) {
        V oldValue = null;
// size correction
        if (size > 0) {
            size--;
        }

        int index = Math.abs(key.hashCode()) % capacity; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            return null;                // значит значения нету выходим
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
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
        this.size = size;
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsValue(Object value) {
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
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
        int index = Math.abs(key.hashCode()) % capacity;
        if (buckets[index] == null) {
            return false;
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];      // получаем список под данный hashCode
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
