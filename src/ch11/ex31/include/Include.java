package ch11.ex31.include;

import java.util.Map;
import java.util.Set;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nCheck Iterator\n");
        Set<Map.Entry<String, String>> hset =  System.getenv().entrySet();  // вытаскиваем набор Set

        for (Map.Entry<String, String> sEntry : hset) {  // итератор по EntrySet
            System.out.printf("%-24s = %s\n",sEntry.getKey(),sEntry.getValue());
        }
    }
}
