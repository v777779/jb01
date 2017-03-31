package ch17.ex20.access;

import lib.maps.Countries;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 20 Map Collision Check Check\n");
        SimpleHashMapC<String,String> sMap = new SimpleHashMapC<>();
        sMap.putAll(Countries.capitals(5));
        sMap.putAll(Countries.capitals(5));

    }
}
