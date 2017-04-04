package ch17.ex42.access;

import lib.generate.GenList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 42 Sort List Check\n");

        System.out.println("Initial List:");
        ArrayList<PairString3> list = new ArrayList<>(GenList.get(new PairString3(4),10));
        System.out.println(list);

        System.out.println("Sorted key  :");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Sorted value:");
        Collections.sort(list, new PairString3.Comp());
        System.out.println(list);

        System.out.println("binarySearch:");
        PairString3 pair = list.get(8);
        int index = Collections.binarySearch(list,pair,new PairString3.Comp());
        System.out.println("index:"+list.get(index)+" pair:"+pair);

    }
}
