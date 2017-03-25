package ch16.ex09.access;

import java.util.List;

/**
 * Created by V1 on 25.03.2017.
 */
public class Peel<T> {
    public T[] array;
    public List<T>[] list;
    public List<T>[] lists = (List<T>[])new List[6];

    public Peel(Object[] array) {
        this.array = (T[])array;
    }

    public Peel(List[] list) {
        this.list = (List<T>[])list;
    }


    public T[] get(T[] arg) {
        return arg;
    }

    public T[] get() {
        return array;
    }

    public List<T>[] getList() {
        return list;
    }

    public List<T>[] getLists() {
        return lists;
    }

}
