package ch17.ex15.access;

import lib.maps.SlowMap2;
import lib.utils.TextFile;

import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 15 SlowMap3 Check\n");

        List<String> list = new TextFile("src/ch17/ex15/access/Test.java", "\\W+");

        SlowMap2<String,Integer> sMap = new SlowMap2<>();
        for (String s : list) {
            if (sMap.get(s) == null) {
                sMap.put(s, 1);
            } else {
                sMap.put(s, sMap.get(s) + 1);
            }
        }
        System.out.println(sMap);


    }
}
