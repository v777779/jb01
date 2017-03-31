package ch17.ex23.access;

import lib.maps.Countries;
import lib.maps.SimpleHashMap;
import lib.utils.Print;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 23 AbstractMap Methods Check\n");

        SimpleHashMap<String,String> sMap = new SimpleHashMap<>();


        sMap.putAll(Countries.capitals(25));
        System.out.println("size:"+sMap.size());
        System.out.println(Print.r(sMap.toString()));

        System.out.println("containsKey(COMOROS):"+sMap.containsKey("COMOROS"));
        System.out.println("containsValue(Accra):"+sMap.containsValue("Accra"));
        System.out.println("remove(COMOROS):"+sMap.remove("COMOROS"));
        System.out.println("remove(GHANA):"+sMap.remove("GHANA"));
        System.out.println("size:"+sMap.size());
        System.out.println(Print.r(sMap.toString()));

        System.out.println("containsKey(COMOROS):"+sMap.containsKey("COMOROS"));
        System.out.println("containsValue(Accra):"+sMap.containsValue("Accra"));
        System.out.println(Print.r(sMap.toString()));

        System.out.println("remove first key:"+sMap.remove(sMap.keySet().iterator().next()));
        System.out.println(Print.r(sMap.toString()));

        System.out.println("size:"+sMap.size());
        System.out.println("isEmpty:"+sMap.isEmpty());
        sMap.clear();
        System.out.println("clear():"+sMap.isEmpty());
        System.out.println("size:"+sMap.size());

    }
}
