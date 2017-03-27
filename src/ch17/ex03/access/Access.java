package ch17.ex03.access;

import lib.container.Countries;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 3 Set Check\n");

        Map<String,String> map = Countries.capitals(10);
        Set<String> hset = new HashSet<>(map.keySet());
        hset.addAll(map.keySet());
        hset.addAll(map.keySet());
        System.out.println(hset);

        Set<String> lhset = new LinkedHashSet<>(map.keySet());
        lhset.addAll(map.keySet());
        lhset.addAll(map.keySet());
        System.out.println(lhset);

        Set<String> tset = new TreeSet<>(map.keySet());
        tset.addAll(map.keySet());
        tset.addAll(map.keySet());
        System.out.println(tset);

    }
}
