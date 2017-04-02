package ch17.ex31.access;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by V1 on 02-Apr-17.
 */
public class ContString implements Iterable<ContString> {
    private String[] strings;
    private int index;

    public ContString(int size) {
        this.strings = new String[size];
        index = 0;
    }

    @Override
    public Iterator<ContString> iterator() {
        return null;
    }


    public void add(String s) {
        if (index >= strings.length) {
            String[] temp = new String[index + 10];
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
        strings[index] = null;  // забываем
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
