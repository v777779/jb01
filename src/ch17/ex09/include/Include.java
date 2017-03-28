package ch17.ex09.include;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nSortedSet Check\n");

        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet,"one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);

        String low = sortedSet.first();
        String high = sortedSet.last();
        System.out.println("low : "+low);
        System.out.println("high: "+high);

        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i < 6 ; i++) {
            if (i == 3) {
                low = it.next();
            } else if (i == 6) {
                high = it.next();
            } else {
                it.next();
            }
        }
        System.out.println("low : "+low);
        System.out.println("high: "+high);

        SortedSet<String> sb = sortedSet.subSet(low, high);
        SortedSet<String> sb2 = sortedSet.headSet(high);
        SortedSet<String> sb3 = sortedSet.tailSet(low);
        System.out.println("sub :"+sb);
        System.out.println("head:"+sb2);
        System.out.println("tail:"+sb3);




    }
}
