package ch17.ex42.thrown;

import java.util.WeakHashMap;

/**
 * Created by V1 on 04-Apr-17.
 */
public class WeakMap {

    public static void check() {

        int size = 10;
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> wMap = new WeakHashMap<>();

        for (int i = 0; i < size; i++) {
            Key k = new Key("Key" + i);
            Value v = new Value("Value" + i);
            if (i % 2 == 0) {
                keys[i] = k; // сохраняется каждая 2 ссылка как обычная поэтому GC их не трогает
            }
            wMap.put(k, v);
        }
        System.out.println("WeakHashMap done...:");
        System.gc(); // вызывается GC для освобождения wMap


    }
}
