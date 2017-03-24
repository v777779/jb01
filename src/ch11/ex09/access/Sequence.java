package ch11.ex09.access;

import lib.utils.Range;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Sequence {
    private List<Integer> items = new ArrayList<>();

    public Sequence(int size) {
        fillArrayList(size);
    }

    public void fillArrayList(int length) {  // добавить сколько надо
        for (int i = 0; i < length; i++) {
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

    public Iterator getIt() {
            return items.iterator();
    }

}

