package ch17.ex33.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class FastList<T> {
    List<T> list = new LinkedList<T>();

    public void add (T t) {
        list.add(t);
    }

    public void addAll(Collection<? extends T> c) {
        list.addAll(c);
    }


    public void remove (int index) {
        list.remove(index);
    }

    public T get(int index) {
        return ((ArrayList<T>)list).get(index);
    }


}
