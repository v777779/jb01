package ch17.ex42.unit;

import lib.maps.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by V1 on 04-Apr-17.
 */
public class VectorEnum {
    public static void check() {
        System.out.println("ArrayList to Vector:");
        Vector<String> vector = new Vector<>(Countries.names(10)); // получить из ArrayList
        System.out.println(vector);

        System.out.println("Vector to ArrayList:");
        ArrayList<String> list = new ArrayList<>(vector);
        System.out.println(list);

        System.out.println("Vector to Enumeration:");
        Enumeration<String> e = vector.elements(); // получить итератор Vector<>
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement()+" : ");  // выт
        }
        System.out.println();
        System.out.println("ArrayList to Enumeration:");
        Collections.shuffle(list);
        Enumeration<String> eList = Collections.enumeration(list); // получить итератор Vector<>
        while (eList.hasMoreElements()) {
            System.out.print(eList.nextElement()+" . ");  //
        }
        System.out.println();

    }
}
