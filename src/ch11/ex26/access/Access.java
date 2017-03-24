package ch11.ex26.access;

import lib.utils.TextFile;
import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    static void showMap(Map<String,ArrayList<Integer>> tmap) {
        int k = 1;
        for (String s : tmap.keySet()) {
            System.out.printf("%12s:%24s",s,tmap.get(s));
            if (k++ % 2 == 0) {
                System.out.println();
            }
        }

    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 26  Check\n");

        ArrayList<String> textList = new TextFile("src/ch11.ex23/local/Local.java", "\\W+"); //ArrayList
        Map<String,ArrayList<Integer>> hmap = new HashMap<>(); // добавить слова в карту

        int count = 0; // число слов с начала файла
        for (String s : textList) {  // прогоняем итератор
            count++;
            if (hmap.get(s) == null) {
                hmap.put(s,new ArrayList<Integer>());
            }
            hmap.get(s).add(count); // добавить счетчик в лист
        }

// Reorder Map
        Map<String,ArrayList<Integer>> lhmap = new LinkedHashMap<>();

        for (String s : textList) {
           lhmap.put(s,hmap.get(s));
        }

        System.out.println("\n\n HashMap\n");
        showMap(hmap);
        System.out.println("\n\n LinkedHashMap\n");
        showMap(lhmap);

    }
}
