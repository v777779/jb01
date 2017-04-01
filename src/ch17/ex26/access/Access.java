package ch17.ex26.access;

import lib.generate.GenRnd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 26 hashCode() Check\n");

        System.out.println("\nCountedString2 hashCode() Map:");
        Map<CountedString2, Integer> map = new HashMap<>();
        CountedString2[] cs = new CountedString2[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i]=new CountedString2("hi", Character.toUpperCase(new GenRnd.GenChar().next()));
            map.put(cs[i],i);                // но будут разные id используется hashCode
        }
        System.out.println(map);

        for (CountedString2 c : cs) {
            System.out.print("Looking up "+c +" :");
            System.out.println(map.get(c));
        }
    }
}
