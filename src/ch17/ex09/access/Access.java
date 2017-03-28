package ch17.ex09.access;

import lib.generate.GenList;
import lib.generate.GenSeq;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");
        TreeSet<String> tSet = new TreeSet<>(new GenList(new GenSeq.GenStr(),6));
        System.out.println(tSet);
        SortedSet<String> sSet = new TreeSet<>(tSet);
        System.out.println(sSet);
    }
}
