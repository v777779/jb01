package ch16.ex08.access;

import java.util.List;

/**
 * Created by V1 on 24.03.2017.
 */
public class ClassParam<T> {
    public List<T>[] lists;
    public List<T>[] clists = (List<T>[])new List[10]; // создание массива с Generic
    public T[] objects;
    public T[] сobjects = (T[])new Object[10]; // создать универсальный массив


    public ClassParam() {
    }

    public ClassParam(List[] lists) {  // Object
        this.lists = (List<T>[])lists;  // casting
    }
    public ClassParam(Object[] objects) {  // Object
        this.objects = (T[])objects;  // casting
    }

    public T[] f(T[] arg) {

        return arg;
    }
}
