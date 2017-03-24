package ch.ex21.integra;

import java.lang.reflect.Array;

/**
 * Created by V1 on 17.03.2017.
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);  // создать массив объектов
    }
}
