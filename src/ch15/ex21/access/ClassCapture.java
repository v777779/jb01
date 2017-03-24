package ch15.ex21.access;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by V1 on 17.03.2017.
 */
public class ClassCapture<T> {  // класс захвата типа класса
    Class<T> kind;
    Map<String, Class<?>> map = new TreeMap<>();  // добавили сортированную map

    public ClassCapture(Class<T> kind) {
        this.kind = kind;
        Map<String, Class<?>> map;
    }

    public void addType(String key, Class<?> value) {
        map.put(key, value);
    }

    public T createNew(String key) {
        try {
            return (T) map.get(key).newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Can't create Instance");
        }
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);  // <arg is instance of kind>
    }

}
