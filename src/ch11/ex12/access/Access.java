package ch11.ex12.access;

import lib.utils.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise   Check\n");

        List<Integer> list = Range.arrayList(10);
        List<Integer> list2 = new ArrayList<Integer>(list);  // сделать копию
        ListIterator <Integer> it = list.listIterator();
        ListIterator <Integer> it2 = list2.listIterator(list2.size());
        System.out.println(list);
        System.out.println(list2);
        while (it.hasNext()) { // it.next() идет от начала к концу
            it2.previous();    // it.previous() идет конца к началу
            it2.set(it.next()); // it2.set() перезаписывает элементы от конца к началу
        }
        System.out.println(list);
        System.out.println(list2);


    }
}
