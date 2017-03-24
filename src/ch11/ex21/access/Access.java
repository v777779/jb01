package ch11.ex21.access;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void showMap(Map<String, Integer> map) {
        int k = 1;
        for (String s : map.keySet()) {
            System.out.printf("%-14s:%2d  ",s,map.get(s));
            if ((k++ % 8) == 0) {
                System.out.println();
            }
        }

    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 21 Map Check\n");

        TextFile textFile = new TextFile("src/ch11.ex16/local/Local.java", "\\W+");
        Map<String, Integer> hmap = new HashMap<>();

        for (String s : textFile) {          // перебрать ArrayList
            if (!hmap.containsKey(s)) {      // найти ключ в HashMap самый быстрый доступ
                hmap.put(s, 1);
            } else {
                hmap.put(s,hmap.get(s)+1);   // отработать повтор
            }
        }

        List<String> list = new ArrayList<>(hmap.keySet());      // вытащить ключи в LinkedList
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);    // отсортировали список
        Map<String,Integer> lhmap = new LinkedHashMap<>();
        for (String s : list) {
            lhmap.put(s,hmap.get(s));
        }

        System.out.println("HashMap:");
        showMap(hmap);

        System.out.println("\n\nLinkedHashMap:");
        showMap(lhmap);


    }
}
