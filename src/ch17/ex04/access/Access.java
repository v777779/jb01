package ch17.ex04.access;

import lib.utils.TextFile;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static ArrayList<String> get(String filename) {
        return new TextFile(filename, "\\W+");
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 4 Collection Init Check\n");

        List<String> list = get("src/ch17/ex04/access/Access.java");
        Set<String> tset = new TreeSet<>(get("src/ch17/ex01/integra/Letters.java"));
        Map<Integer, String> tmap = new TreeMap<>();
        int index = 1;
        for (String s : tset) {
            tmap.put(index++, s);
        }
        System.out.println(list);
        System.out.println(tset);
        System.out.println(tmap);

    }
}
