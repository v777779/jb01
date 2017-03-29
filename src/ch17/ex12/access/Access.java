package ch17.ex12.access;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static Map<String,String> check(Map<String,String > map) {

        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");
        try {
            map.put("extra", "object");
        } catch (Exception e) {
            System.out.println("catch: map bound exception");
        }
        System.out.println(map);
        System.out.println(map.get("ocean"));
        return map;
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12 Map Check\n");

        HashMap<String,String> hMap = new HashMap<>(6);
        TreeMap<String,String> tMap = new TreeMap<>();
        LinkedHashMap<String,String> lhMap = new LinkedHashMap<>(6);

        System.out.println("HashMap:");
        check(hMap);
        System.out.println("TreeMap:");
        check(tMap);
        System.out.println("LinkedHashMap:");
        check(lhMap);


    }
}
