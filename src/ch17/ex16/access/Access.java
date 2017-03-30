package ch17.ex16.access;

import lib.maps.CMapInt;
import lib.maps.Maps;

import java.util.HashMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 16 SlowMap3 Check\n");

        Maps.check(new HashMap<>());
        SlowMap3<Integer,String> sMap = new SlowMap3<>();
        sMap.putAll(new CMapInt(25));
        System.out.println(sMap.keySet());
        System.out.println(sMap);
        System.out.println(sMap.values());
        Maps.check(new SlowMap3<>());



    }
}
