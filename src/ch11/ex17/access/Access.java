package ch11.ex17.access;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 17 Map KeySet()  Check\n");

        Map<String, Gerbil> map = new HashMap<>(); // карта
        for (int i = 0; i < 10 ; i++) {
            map.put(Gerbil.getName(8),new Gerbil());  // заполняем
        }
        System.out.println("Map content:");
        System.out.println(map);
        System.out.println();
//        Iterator<String> it = map.keySet().iterator();
//        Iterator<Gerbil> it2 = map.values().iterator();
//        Iterator<Map.Entry<String,Gerbil>> itEntry = map.entrySet().iterator();

        System.out.println("Map KeySet() Iterator:");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("key:"+key+" value:"+map.get(key).hop());
        }


    }
}
