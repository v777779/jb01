package ch17.ex22.access;

import lib.maps.Countries;
import lib.utils.Print;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 22 Methods for SimpleHashMapL Check\n");
        SimpleHashMap<String,String> sMap = new SimpleHashMap<>();
        sMap.putAll(Countries.capitals(25));
        System.out.println(Print.r(sMap.toString()));
        System.out.println("size:"+sMap.size());

        sMap.remove("CAPE VERDE");
        sMap.remove("CAMEROON");
        System.out.println(Print.r(sMap.toString()));
        System.out.println("size:"+sMap.size());

        sMap.remove(sMap.keySet().iterator().next());
        System.out.println(Print.r(sMap.toString()));
        System.out.println("size:"+sMap.size());
        System.out.println("isEmpty:"+sMap.isEmpty());
        sMap.clear();
        System.out.println("clear():"+sMap.isEmpty());

    }
}
