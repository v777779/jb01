package ch.ex24.access;

import lib.utils.IFactory;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by V1 on 17.03.2017.
 */
public class ClassCapture<T> {  // класс захвата типа класса
    Map<String,IFactory<?extends T>> map = new TreeMap<>();  // добавили сортированную map

    public ClassCapture() {
        Map<String,IFactory<?extends T>> map;
    }

    public void addType(String key, IFactory<?extends T> value) {
        map.put(key, value);
    }

    public T createNew(String key) {
            return map.get(key).create();
    }

}
