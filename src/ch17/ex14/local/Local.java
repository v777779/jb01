package ch17.ex14.local;

import lib.maps.Maps;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMap Check\n");

        Maps.check(new HashMap<>());
        Maps.check(new TreeMap<>());
        Maps.check(new LinkedHashMap<>());
        Maps.check(new IdentityHashMap<>());
        Maps.check(new ConcurrentHashMap<>());
        Maps.check(new WeakHashMap<>());

        Maps.check( (Map)(new Properties()));

    }
}
