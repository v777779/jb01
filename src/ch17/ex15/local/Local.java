package ch17.ex15.local;

import lib.maps.CMapInt;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nSortedMap Check\n");

        TreeMap<Integer, String> sortedMap = new TreeMap<>(new CMapInt(10)); // сортированная карта

        System.out.println(sortedMap);

        Integer low = sortedMap.firstKey();
        Integer high = sortedMap.lastKey();
        System.out.println("low : " + low);
        System.out.println("high: " + high);

        Iterator<Integer> it = sortedMap.keySet().iterator();
        for (int i = 0; i < 7; i++) {
            if (i == 3) {
                low = it.next();
            } else if (i == 6) {
                high = it.next();
            } else {
                it.next();
            }
        }

        System.out.println("low : " + low);
        System.out.println("high: " + high);

        SortedMap sb = sortedMap.subMap(low, high);
        SortedMap sb2 = sortedMap.headMap(high);
        SortedMap sb3 = sortedMap.tailMap(low);
        System.out.println("sub :" + sb);
        System.out.println("head:" + sb2);
        System.out.println("tail:" + sb3);

    }
}
