package lib.utils;

import java.util.LinkedHashMap;

/**
 * Created by V1 on 3/27/2017.
 */
public class MapData<K, V> extends LinkedHashMap<K, V> {
    // конструктор
    public MapData(IGenerator<Pair<K, V>> gen, int size) {  // генератор ключей, значений
        for (int i = 0; i < size; i++) {
            Pair<K, V> p = gen.next();   // сгенерили объект Pair() реализация генератора внешняя
            put(p.key, p.value);        //
        }
    }

    // два генератора
    public MapData(IGenerator<K> genK, IGenerator<V> genV, int size) {
        for (int i = 0; i < size; i++) {  // генератор ключей, значений
            put(genK.next(), genV.next()); // два разных генератора
        }
    }
    // генератор ключей
    public MapData(IGenerator<K> genK, V value, int size) {
        for (int i = 0; i < size; i++) {
            put(genK.next(), value);        // генератор ключей и значение
        }
    }

    // два генератора
    public MapData(Iterable<K> genK, IGenerator<V> genV) {
        for (K key : genK) {
            put(key, genV.next());          // два разных генератора
        }
    }
    // генератор ключей
    public MapData(Iterable<K> genK, V value) {
        for (K key : genK) {
            put(key, value);                // генератор ключей и значение
        }
    }
// Генераторы Map
// Mapdata >> LinkedHashMap (Pair(K,V))
    public static <K,V> MapData<K,V>  get(IGenerator<Pair<K,V>> gen, int size) {
        return new MapData<K, V>(gen,size);
    }
// Mapdata >> LinkedHashMap (Gen(K),Gen(V))
    public static <K,V> MapData<K,V>  get(IGenerator<K> genK, IGenerator<V> genV, int size) {
        return new MapData<K, V>(genK,genV,size);
    }
// Mapdata >> LinkedHashMap (Gen(K),V)
    public static <K,V> MapData<K,V>  get(IGenerator<K> genK, V value, int size) {
        return new MapData<K, V>(genK,value,size);
    }
// Mapdata >> LinkedHashMap (Iter(K),Gen(V))
    public static <K,V> MapData<K,V>  get(Iterable<K> genK, IGenerator<V> genV) {
        return new MapData<K, V>(genK,genV);
    }
// Mapdata >> LinkedHashMap (Iter(K),V)
    public static <K,V> MapData<K,V>  get(Iterable<K> genK, V value) {
        return new MapData<K, V>(genK,value);
    }
}
