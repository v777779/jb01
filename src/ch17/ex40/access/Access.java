package ch17.ex40.access;

import lib.generate.GenList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 40 Sort Check\n");

        ArrayList<PairString> list = new ArrayList<>(GenList.get(new PairString(4),25));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new PairString.Comp());
        System.out.println(list);

        PairString pair = list.get(12);
        int index = Collections.binarySearch(list,pair,new PairString.Comp());
        System.out.println("index:"+list.get(index)+" pair:"+pair);



    }
}
