package ch17.ex21.access;

import lib.maps.Maps;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 21 SimpleHashMapL Iteration Search Check\n");
        SimpleHashMapD<Integer,Integer> sMap = new SimpleHashMapD<>();

        sMap.putAll(Maps.ints(100000));
        System.out.println("map size:"+sMap.size());
        sMap.putAll(Maps.ints(2));
        sMap.putAll(Maps.ints(2));
        sMap.putAll(Maps.ints(2));
    }
}
