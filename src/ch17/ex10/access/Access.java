package ch17.ex10.access;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");

        List<String> list = new ArrayList(Arrays.asList("one two three four five six seven eight".split(" ")));
        System.out.println(list);

        SortedList sl = new SortedList(list);
        System.out.println(sl);
        String low = sl.first();
        String high = sl.last();
        System.out.println(low);
        System.out.println(high);
        Iterator<String> it = sl.iterator();
        for (int i = 0; i < sl.size(); i++) {
            String s =  it.next();
            if (i == 3) {
                low = s;
            }
            if (i == 7) {
                high = s;
            }
        }
        System.out.println(low);
        System.out.println(high);

        SortedList sb = sl.subSet(low,high);
        SortedList sb2 = sl.headSet(high);
        SortedList sb3 = sl.tailSet(low);
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);


    }
}
