package ch17.ex15.thrown;

import lib.maps.Countries;
import lib.maps.SlowMap;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Thrown {
    public static void app() {
        System.out.println("\n====THROWN===");
        System.out.println("\nHashMap based on ArrayList  Check\n");

        System.out.println("External Entry Class:");
        SlowMap<String, String> sMap = new SlowMap<>();
        sMap.putAll(Countries.capitals(15)); // проинициализировать
        System.out.println(sMap);
        System.out.println(sMap.get("EGYPT"));
        System.out.println(sMap.entrySet());

        System.out.println("\nInternal Entry Class:");
        SlowMapE<String, String> sMap2 = new SlowMapE<>();
        sMap2.putAll(Countries.capitals(15)); // проинициализировать
        System.out.println(sMap2);
        System.out.println(sMap2.get("CAMEROON"));
        System.out.println(sMap2.entrySet());

    }
}
