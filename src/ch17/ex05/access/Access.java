package ch17.ex05.access;

import ch17.ex05.CIntMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 5 AbstractMap Check\n");
        Map<Integer,String> cMap = new CIntMap(25);
        System.out.println(cMap);

        Set<Map.Entry<Integer,String>> entries = cMap.entrySet();
        Iterator<Map.Entry<Integer,String>> it = entries.iterator();
        for (int i = 0; i < entries.size() ; i++) {
            Map.Entry entry = it.next();
            System.out.print(entry.getKey()+"="+entry.getValue()+" ");
        }
        System.out.println();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.print(entry.getKey()+" "+entry.getValue()+" ");

        }
    }
}
