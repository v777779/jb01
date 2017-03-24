package ch.ex25.integra;

import java.lang.reflect.Array;

/**
 * Created by V1 on 18.03.2017.
 */
public class GenArrayToken<T> {
    private T[] array;

    public GenArrayToken(Class<T> type, int size) {
        array = (T[])Array.newInstance(type,size);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }
}
