package ch16.ex09.access;

import java.util.List;

/**
 * Created by V1 on 25.03.2017.
 */
public class PeelMethod {
    public static<T> T[] get(T[] arg) {
        return arg;
    }

    public static<T> T[] get() {            // не работает, то есть да массив дает
        T[] array = (T[]) new Object[5];    //но он затирается и с ним
        return (T[])array;                  // невозможно работать
    }


    public static <T> List<T>[] getList(List<T>[] list) {
        return list;
    }

    public static <T> List<T>[] getListCast(List[] list) {
        return (List<T>[])list;
    }

    public static <T> List<T>[] getLists() {
       List<T>[] lists = (List<T>[])new List[10];
       return lists;
    }

    public static <T> List<T>[] getListsCast() {
        List<T>[] lists = (List<T>[])new List[10];
        return (List<T>[])lists;
    }

}
