package ch17.ex25.access;

import java.util.*;

/**
 * Created by V1 on 31-Mar-17.
 */
public class SimpleHashMapL<K, V> extends AbstractMap<K, V> {
    static final int SIZE = 5;
    LinkEntry<K, V>[] buckets = new LinkEntry[SIZE]; // массив LinkedList[] базовый элемент упрощенный Set<>

    @Override
    public V put(K key, V value) {
        V oldValue = null;

        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {  // не заполнен
            buckets[index] = new LinkEntry<K, V>(key, value);  // тип можно не задавать
        }

        LinkEntry<K, V> pair = new LinkEntry<K, V>(key, value);
        LinkEntry<K, V> link = buckets[index];      // получаем список под данный hashCode
        LinkEntry<K, V> prev = link;                // получаем список под данный hashCode

        boolean found = false;
        while (link != null) {
            LinkEntry<K, V> iPair = link;     // получили элемент из списка
            if (iPair.getKey().equals(key)) {           // нашли точно такой же элемент
                oldValue = iPair.getValue();            // старое значение запомнили
                iPair.setValue(value);                  // задали новое значение
                found = true;                           // нашли элемент в HashMap
                break;
            }
            prev = link;
            link = link.getNext();                      // переключили контекст
        }
        if (!found) {  // не нашли
            prev.setNext(pair);                         // добавили в общую карту
        }
        return oldValue;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
        if (buckets[index] == null) {   // не заполнен
            return null;                // значит значения нету выходим
        }
        LinkEntry<K, V> link = buckets[index];      // получаем список под данный hashCode
        while (link != null) {
            LinkEntry<K, V> iPair = link;     // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                return iPair.getValue();        // возвращаем значение
            }
            link = link.getNext();                      // переключили контекст
        }
        return null;  // не нашли
    }

    private LinkedList<LinkEntry<K, V>> collect() {
        LinkedList<LinkEntry<K, V>> list = new LinkedList<>();
        for (LinkEntry<K, V> link : buckets) {
            if (link == null) {
                continue;
            }
            while (link != null) {
                list.add(link);
                link = link.getNext();
            }
        }
        return list;
    }


    private class EntrySet extends AbstractSet<Entry<K, V>> {
        @Override
        public Iterator<Entry<K, V>> iterator() {
            return new Iterator<Entry<K, V>>() {
                private int index = -1;
                private LinkedList<LinkEntry<K,V>> list = collect();
                @Override
                public boolean hasNext() {
                    return index < list.size() - 1;
                }

                @Override
                public Entry<K, V> next() {
                    index++;
                    return list.get(index);
                }

                @Override
                public void remove() {
                    if (index < 0) {
                        throw new RuntimeException("catch: can't remove");
                    }
                    EntrySet.this.remove(list.get(index).getKey()); // удалить по ключу по текущему индексу
                    list.remove(index);
                    index--;
                }
            };
        }

        @Override
        public boolean remove(Object o) {
            V oldValue = null;
            K key = (K) o;
            int index = Math.abs(key.hashCode()) % SIZE; // hachCode() реализуется в классе хранения обрезается по SIZE
            if (buckets[index] == null) {   // не заполнен
                return false;                // не заполнено, нечего удалять
            }
            LinkEntry<K, V> link = buckets[index];      // получаем список под данный hashCode
            LinkEntry<K, V> prev = null;      // получаем список под данный hashCode
            boolean found = false;

            while (link != null) {
                LinkEntry<K, V> iPair = link;  // получили элемент из списка
                if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                    oldValue = iPair.getValue();    // старое значение запомнили
                    if (prev == null) {
                        buckets[index] = buckets[index].getNext();
                    } else {
                        prev.setNext(link.getNext());
                    }
                    return true;
                }
                prev = link;
                link = link.getNext();          // переключили на следующий элемент
            }
            return false; // ничего не удалили
        }

        @Override
        public int size() {
            return SimpleHashMapL.this.size();
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {  // тупо заполняем массив карты
        return new EntrySet();
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
        if (buckets[index] == null) {   // не заполнен
            return null;                // не заполнено, нечего удалять
        }
        LinkEntry<K, V> link = buckets[index];      // получаем список под данный hashCode
        LinkEntry<K, V> prev = null;      // получаем список под данный hashCode
        boolean found = false;

        while (link != null) {
            LinkEntry<K, V> iPair = link;  // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                oldValue = iPair.getValue();    // старое значение запомнили
                if (prev == null) {
                    buckets[index] = buckets[index].getNext();  // null or next link
                } else {
                    prev.setNext(link.getNext()); // null or next link
                }
                return oldValue;
            }
            prev = link;
            link = link.getNext();          // переключили на следующий элемент
        }
        return null;
    }

    @Override
    public int size() {
        int size = 0;
        for (LinkEntry<K, V> link : buckets) {
            if (link == null) {
                continue;
            }
            while (link != null) {
                link = link.getNext();  // прогнать всю цепочку
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (LinkEntry<K, V> bucket : buckets) {
            if (bucket != null)  // тут нет пустых списков
                return false;
        }
        return true;
    }

    @Override
    public boolean containsValue(Object value) {
        for (LinkEntry<K, V> link : buckets) {
            if (link == null) {
                continue;
            }
            while (link != null) {
                if (link.getValue().equals(value)) {   // нашли точно такой же элемент
                    return true;                             // возвращаем значение
                }
                link = link.getNext();
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
        LinkEntry<K, V> link = buckets[index];      // получаем список под данный hashCode

        while (link != null) {
            LinkEntry<K, V> iPair = link;  // получили элемент из списка
            if (iPair.getKey().equals(key)) {   // нашли точно такой же элемент
                return true;                    // возвращаем значение
            }
            link = link.getNext();
        }
        return false;  // не нашли
    }

}
