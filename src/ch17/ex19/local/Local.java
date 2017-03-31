package ch17.ex19.local;

import lib.maps.Countries;
import lib.maps.SimpleHashMap;
import lib.utils.Print;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {


    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nHash Speed Check\n");
        SimpleHashMap<String,String> sMap = new SimpleHashMap<>();
        sMap.putAll(Countries.capitals(25));
        System.out.println(Print.r(sMap.toString()));
        System.out.println(sMap.get("ERITREA"));
        System.out.println(Print.r(sMap.entrySet().toString()));
    }


}
