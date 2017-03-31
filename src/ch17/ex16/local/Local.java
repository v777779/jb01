package ch17.ex16.local;

import lib.maps.Maps;

import java.util.HashMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nSlowMap EntrySet Check\n");

        Maps.check(new HashMap());
        Maps.check(new SlowMap2<>());

    }
}
