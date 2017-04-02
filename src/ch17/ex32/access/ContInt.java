package ch17.ex32.access;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ContInt implements Iterable<ContInt> {
    private int[] ints;
    private int index;

    public ContInt(int size) {
        this.ints = new int[size];
        index = 0;
    }

    @Override
    public Iterator<ContInt> iterator() {
        return null;
    }


    public void add(int intVal) {
        if (index >= ints.length) {
            int[] temp = new int[index + 10];
            for (int i = 0; i < ints.length; i++) {
                temp[i] = ints[i];
            }
            ints = temp;
        }
        ints[index++] = intVal;  // индекс всегда указывает на новую  пустую ячейку
    }

    public void remove() {
        if (index > 0) {
            index--;
        }
//        ints[index] = 0;  // забываем
    }

    public void addAll(Collection<Integer> c) {
        for (Integer intVal : c) {
            add(intVal);
        }
    }

    public int size() {
        return index;
    }

    public int length() {
        return ints.length;
    }

    public void clear() {
        ints = new int[10];
        index = 0;
    }


    @Override
    public String toString() {
        return Arrays.toString(ints);
    }

}
