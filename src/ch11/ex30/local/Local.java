package ch11.ex30.local;

import lib.utils.Show;
import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nIterator  Check\n");

        ArrayList<String> listA = new TextFile("../lesson_lib/lib/utils/Range.java","\\W+");
        ArrayList<String> listB = new TextFile("../lesson_lib/lib/utils/Show.java","\\W+");
        TreeSet<String> listKey = new TreeSet<>(new CompStrL());
        listKey.addAll(listA);
        Random rnd = new Random();

        Map<String,String> lhmap = new LinkedHashMap<>();
        for (String s : listKey) {
            lhmap.put(s,listB.get(rnd.nextInt(listB.size()))); // значение по случайному берем по индексу
        }

        Show.showStr(listKey.iterator());
        Show.showStr(listA.iterator());
        Show.showStr(listB.iterator());

        Show.showStr(lhmap.keySet().iterator());
        Show.showStr(lhmap.values().iterator());
        Show.showMapSS(lhmap);
        Show.showCStr(listKey);
        Show.showCStr(lhmap.values());









    }
}
