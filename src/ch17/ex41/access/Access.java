package ch17.ex41.access;

import ch17.ex40.access.PairString;
import lib.generate.GenList;
import lib.maps.Countries;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 41 HashSet Check\n");
        Set<PairString> hSet = new HashSet<>(GenList.get(new PairString(6),25)); // создать и инициализировать
        System.out.println(hSet);

        Map<PairString,String> hMap = new HashMap<>();

        List<String> list = new ArrayList<>(Countries.names(25));
        Collections.shuffle(list);
        Iterator<String> it= list.iterator();
        for (PairString key : hSet) {
            hMap.put(key,it.next());
        }
        System.out.println(hMap);
        System.out.println(hMap.size());

        Map<PairString,String> tMap = new TreeMap<>(hMap);
        System.out.println(tMap);

    }
}
