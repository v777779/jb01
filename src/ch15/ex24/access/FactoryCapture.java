package ch15.ex24.access;

import lib.utils.IFactory;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by V1 on 17.03.2017.
 */
public class FactoryCapture {  // класс захвата типа класса
    Map<String,IFactory<?>> map = new TreeMap<>();  // добавили сортированную map

    public FactoryCapture() {
        Map<String,IFactory<?>> map;
    }

    public void addType(String key, IFactory<?> value) {
        map.put(key, value);
    }

    public Object createNew(String key) {
            return map.get(key).create();
    }

}
