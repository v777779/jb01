package ch17.ex16.access;

import lib.maps.Maps;

import java.util.HashMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 16 SlowMap Check\n");

        Maps.check(new HashMap<>());
        Maps.check(new SlowMap<>());

    }
}
