package ch17.ex31.access.office;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ContStringOffice implements Iterable<ContStringOffice> {
    private String[] strings;
    private int index;

    public ContStringOffice() {
        this.strings = new String[10];
        index = 0;
    }
    public ContStringOffice(int size) {
        this.strings = new String[size];
        index = 0;
    }

    @Override
    public Iterator<ContStringOffice> iterator() {
        return null;
    }
    public void add(String s) {
        if (index >= strings.length) {
            String[] temp = new String[index + (strings.length/5 > 0? strings.length/5:10) ];
            for (int i = 0; i < strings.length; i++) {
                temp[i] = strings[i];
            }
            strings = temp;
        }
        strings[index++] = s;  // индекс всегда указывает на новую  пустую ячейку
    }

    public void remove() {
        if (index > 0) {
            index--;
        }
//        strings[index] = null;  // забываем  не нужно ничего писать
    }

    public String get(int index) {
        if (index >= 0 && index <= this.index) {
            return strings[index];
        }
        throw new RuntimeException("Out of Bounds");
    }

    public void addAll(Collection<String> c) {
        for (String s : c) {
            add(s);
        }
    }

    public int size() {
        return index;
    }

    public int length() {
        return strings.length;
    }

    public void clear() {
        strings = new String[10];
        index = 0;
    }


    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

}
