package ch17.ex26.local;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nHashCode String Check\n");

        String [] strings = "Hello Hello".split(" ");
        System.out.println(strings[0].hashCode());
        System.out.println(strings[1].hashCode());

        System.out.println("\nCountedString2 hashCode() Map:");
        Map<CountedString, Integer> map = new HashMap<>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i]=new CountedString("hi"); // добавляем одно и то же значение
            map.put(cs[i],i);                // но будут разные id используется hashCode
        }
        System.out.println(map);

        for (CountedString c : cs) {
            System.out.print("Looking up "+c +" :");
            System.out.println(map.get(c));
        }

    }
}
