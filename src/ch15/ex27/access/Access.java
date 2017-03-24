package ch15.ex27.access;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 27 Wildcards Check\n");
//       List<Number> list = new ArrayList<Integer>();          // не компилируется
        List<?extends Number> list2 = new ArrayList<Integer>();
//        list2.add(new Integer(2));  // не работает
//        list2.add(new Integer(4)); // не работает

    }
}
