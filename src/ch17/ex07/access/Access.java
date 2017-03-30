package ch17.ex07.access;

import lib.maps.Countries;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 7 List Generators Check\n");

        System.out.println("ArrayList and LinkedList:");
        ArrayList<String> aList = new ArrayList<>(Countries.names(10));
        LinkedList<String> bList = new LinkedList<>(Countries.names(20).subList(10,20));
        System.out.println(aList);
        System.out.println(bList);

        System.out.println("\nForward Step Iteration:");
        ListIterator<String> aLit = aList.listIterator();
        ListIterator<String> bLit = bList.listIterator();

        int index = 0;

        while (aLit.hasNext()) {
            aLit.add(bLit.next());
            aLit.next();
        }

        System.out.println(aList);
        System.out.println(bList);

        System.out.println("\nBackward Step Iteration:");
        aLit = aList.listIterator();
        bLit = bList.listIterator(bList.size());

        while (bLit.hasPrevious()) {
            aLit.add(bLit.previous());
            aLit.next();
        }
        System.out.println(aList);
        System.out.println(bList);

    }
}
