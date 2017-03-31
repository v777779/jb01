package ch17.ex21.access;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static Map<Integer, Integer> get(int size) {
        Map<Integer, Integer> map = new HashMap<>();
        Random rnd = new Random();
        for (int i = 0; i < size ; i++) {
            map.put(rnd.nextInt(100000),rnd.nextInt(10000));
        }
        return map;
    }
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 21 SimpleHashMap Iteration Search Check\n");
        SimpleHashMapD<Integer,Integer> sMap = new SimpleHashMapD<>();

        sMap.putAll(get(100000));
        System.out.println("map size:"+sMap.size());
        sMap.putAll(get(2));
        sMap.putAll(get(2));
        sMap.putAll(get(2));
    }
}
