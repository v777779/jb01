package ch17.ex17.access;

import lib.maps.Maps;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");
        Maps.check(new SlowMap2A<>());
    }
}
