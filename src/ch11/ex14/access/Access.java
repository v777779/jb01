package ch11.ex14.access;

import lib.utils.Range;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise   Check\n");
        LinkedList<Integer> list = new LinkedList<>();  // пустой контейнер
        ListIterator<Integer> it = list.listIterator();
        it.add(Range.getInt(100));  // два значения
        it.add(Range.getInt(100));
        for (int i = 0; i < 20 ; i++) {
            it = list.listIterator(list.size()/2-1);
            it.next();
            it.add(Range.getInt(100));
            System.out.println(list);
        }


    }
}
