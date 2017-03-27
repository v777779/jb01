package ch17.ex02.access;

import lib.container.Countries;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 2 Check\n");

        TreeSet<String> tSet = new TreeSet<>(Countries.map.keySet());

        String bStr = "";
        for (String s : tSet) {
            if (s.charAt(0) == 'B') {
                bStr =  s;
                break;
            }
        }

        TreeMap<String,String> tMap = new TreeMap<>(Countries.map);

        Map<String,String> cMap = new TreeMap<>(tMap.subMap(tMap.firstKey(),bStr));
        Map<String,String> dMap = tMap.headMap(bStr);
        System.out.println(cMap);
        System.out.println(dMap);

        Set<String> cSet =  tSet.subSet(tSet.first(),bStr);
        TreeSet<String> dSet = new TreeSet(tSet.headSet(bStr));

        System.out.println(cSet);
        System.out.println(dSet);





    }
}
