package ch16.ex25.access;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 25 Check\n");
        List<Integer> aList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(aList.getClass().getSimpleName());
        System.out.println(aList);
        System.out.println(aList.get(4));
        aList.add(6);
        aList.addAll(new ArrayList<Integer>(Arrays.asList(7,8)));
        System.out.println(aList);
        List<Integer> bList = aList.subList(2,4);
        System.out.println(bList);

        MyList list2 = new MyList(aList); // от списка к списку
        System.out.println(list2);
        Collections.sort(list2,list2.reversed());
        System.out.println(list2);
    }
}
