package ch17.ex33.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class FastList<T> extends LinkedList<T> {
    private boolean syncArray = false;
    List<T> list = new ArrayList<T>();

    private void syncArray() {
        if (!syncArray) {
            list = new ArrayList<T>(this);
            syncArray = true;
        }
    }

    @Override
    public T get(int index) {
        syncArray();
        return list.get(index);
    }

    @Override
    public T set(int index, T element) {
        syncArray();
        return list.set(index, element);
    }


    @Override
    public int size() {
        syncArray = false;
        return super.size();
    }

    @Override
    public void add(int index, T element) {
        syncArray = false;
        super.add(index, element);
    }

    @Override
    public T remove(int index) {
        syncArray = false;
        return super.remove(index);
    }

    @Override
    public T remove() {
        syncArray = false;
        return super.remove();
    }

    @Override
    public boolean add(T t) {
        syncArray = false;
        return super.add(t);
    }


    @Override
    public boolean addAll(Collection<? extends T> c) {
        syncArray = false;
        return super.addAll(c);
    }


}
