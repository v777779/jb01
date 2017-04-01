package ch17.ex27.access;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 27 hashCode() Check\n");

        System.out.println("\nCountedString3 hashCode() Map:");
        Map<CountedString3, Integer> map = new HashMap<>();
        CountedString3[] cs = new CountedString3[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i]=new CountedString3("hi");
            map.put(cs[i],i);                // но будут разные id используется hashCode
        }
        System.out.println(map);

        for (CountedString3 c : cs) {
            System.out.print("Looking up "+c +" :");
            System.out.println(map.get(c));
        }
    }
}
