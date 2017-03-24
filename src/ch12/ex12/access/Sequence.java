package ch12.ex12.access;

import lib.utils.Range;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Sequence implements Iterable<Integer> {
    private List<Integer> items = new ArrayList<>();
    private final int MAX_SIZE = 25;

    public Sequence(int size) throws MaxSizeEx{
        if (size > 25) {
            throw new MaxSizeEx();
        }
        for (int i = 0; i < size; i++) {
            items.add(Integer.valueOf(Range.getInt(100))); // заполнить объектами Integer
        }
    }

    public void showForEach() {
        System.out.println("Collection with  Iterator ["+items.size()+"]");
        for (Integer item : items) {
            System.out.print(item+" ");  // вывести текущий объект
        }
        System.out.println();
    }

    @Override
    public Iterator iterator() {
        return items.iterator();   // для своего класса new Iterator() {}
    }
}

