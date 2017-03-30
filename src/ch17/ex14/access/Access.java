package ch17.ex14.access;

import lib.maps.Maps;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 14 Properties Check\n");
//        Maps.check(new HashMap<>());
//        Maps.check(new TreeMap<>());
//        Maps.check(new LinkedHashMap<>());

        Maps.check( (Map)(new Properties()));

    }
}
