package ch17.ex19.access;

import lib.maps.SimpleHashMap;
import lib.utils.TextFile;

import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 19 Count Words w SimpleHashMapD Check\n");

        List<String> list = new TextFile("src/ch17/ex19/access/Test.java", "\\W+");
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>();
        for (String s : list) {
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        System.out.println(map);

    }
}
