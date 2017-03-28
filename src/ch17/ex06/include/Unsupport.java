package ch17.ex06.include;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by V1 on 3/28/2017.
 */
public class Unsupport {
    public static void check(String s, List<String> list) {
        System.out.printf("\n%-20s\n", s);
        System.out.println("-----------------");
        Collection<String> c = list;
        Collection<String> sublist = list.subList(1, 8);
// Копирование части списка
        Collection<String> c2 = new ArrayList<>(sublist);
// retainAll
        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("catch: retainAll()");
        }

// removeAll
        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("catch: removeAll()");
        }

// clear
        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("catch: clear()");
        }

// add
        try {
            c.add("AWorld");
        } catch (Exception e) {
            System.out.println("catch: add()");
        }
// addAll
        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("catch: addAll()");
        }
// remove
        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("catch: remove()");
        }
// set
        try {
            list.set(0,"C");
        } catch (Exception e) {
            System.out.println("catch: set()");
        }

    }

}
