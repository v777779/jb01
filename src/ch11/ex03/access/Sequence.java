package ch11.ex03.access;

import lib.utils.Range;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Sequence {
    private Collection<Integer> items;
    public Sequence() {
        items = new ArrayList<>();          // просто создали коллекцию
    }

    public void newSequence(int length) {  // добавить сколько надо
        for (int i = 0; i < length; i++) {
            items.add(Integer.valueOf(Range.getInt(100))); // заполнить объектами Integer
        }
    }

    public void show() {
        System.out.println("Collection with  Iterator ["+items.size()+"]");
        for (Integer item : items) {
            System.out.print(item+" ");  // вывести текущий объект
        }
        System.out.println();
    }

}

