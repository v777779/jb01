package ch11.ex19.access;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 19  Check\n");

        Set<String> hset = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hset.add(new String(String.format("key_%02d",(i+1))));//, Range.getInt(100);
        }
        System.out.print("HashMap unsorted:");
        System.out.println(hset);

        String [] sArray = hset.toArray(new String[0]);  // в массив
        Arrays.sort(sArray);
        System.out.println("Array:");
        System.out.print("sArray sorted:");
        System.out.println(Arrays.asList(sArray));

        Set<String> lhset = new LinkedHashSet<>(Arrays.asList(sArray)); // из списка
        System.out.print("LinkedHashSet:");
        System.out.println(lhset);

// TreeSet way

        System.out.println("TreeSet:");
        Set<String> tset = new TreeSet<>(hset);
        System.out.print("TreeSet       :");
        System.out.println(tset);
        Set<String> lhsetB = new LinkedHashSet<>(tset);
        System.out.print("LinkedHashSetB:");
        System.out.println(lhsetB);
//HashSet

    }
}
