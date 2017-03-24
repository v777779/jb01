package ch11.ex25.access;

import net.mindview.util.TextFile;

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
        System.out.println("\nExercise 25  Check\n");
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


        Set<String> tset = new TreeSet<>(hmap.keySet());
        Map<String,ArrayList<Integer>> tmap = new TreeMap<>(hmap);
        System.out.println("\n\n HashMap\n");
        showMap(hmap);
        System.out.println("\n\n TreeMap\n");
        showMap(tmap);

        System.out.println("\n\nOfficial version\n");
        Map<String,ArrayList<Integer>> hmap2 = new HashMap<>(); // добавить слова в карту
        count = 0; // число слов с начала файла
        for (String s : textList) {  // прогоняем итератор
            ArrayList<Integer> hList = hmap2.get(s); // создается ссылка на ArrayList
            if (hList == null) {
                hList =  new ArrayList<Integer>();  // новая инициализация
                hmap2.put(s,hList);
            }
            hList.add(++count);                     // добавить счетчик в лист
        }

        System.out.println("\n\n HashMap\n");
        showMap(hmap2);




    }
}
