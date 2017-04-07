package ch17.ex32.access.office;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ContIntOffice implements Iterable<ContIntOffice> {
    private int[] ints;
    private int index;

    public ContIntOffice() {
        this.ints = new int[10];
        index = 0;
    }

    public ContIntOffice(int size) {
        this.ints = new int[size];
        index = 0;
    }

    @Override
    public Iterator<ContIntOffice> iterator() {
        return null;
    }


    public void add(int val) {
        if (index >= ints.length) {
            int[] temp = new int[index + (ints.length/5 > 0? ints.length/5:10) ];
            for (int i = 0; i < ints.length; i++) {
                temp[i] = ints[i];
            }
            ints = temp;
        }
        ints[index++] = val;  // индекс всегда указывает на новую  пустую ячейку
    }

    public void set(int index, int value) {
        if (index >= 0 && index < this.index ) {    // индекс в пределах
            ints[index] = value;                          // инкрементировать ячейку
        }
    }

    public int get(int index) {
        if (index >= 0 && index < this.index ) {    // индекс в пределах
            return ints[index];                     // выдать ячейку
        }
        throw new RuntimeException("Out of Bounds");
    }

    public void remove() {
        if (index > 0) {
            index--;
        }
//        ints[index] = null;  // забываем  не нужно ничего писать
    }

    public void addAll(Collection<Integer> c) {
        for (int s : c) {
            add(s);
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
