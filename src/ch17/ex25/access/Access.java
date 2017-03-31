package ch17.ex25.access;

import lib.maps.Maps;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 25 MapEntry LinkedList Check\n");
        Maps.checkSMap(new SimpleHashMapL<>());
        Maps.checkIMap(new SimpleHashMapL<>());


    }
}
