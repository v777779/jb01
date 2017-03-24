package ch11.ex31.local;

import lib.rodent.Rodent;
import lib.utils.TextFile;
import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nCollection ForEach  Check\n");
        Set<String> hset = new HashSet(new TextFile("src/ch11.ex30/local/CompStrl.java","\\W+"));
        Collection<String> c = new LinkedList<>(hset);  // LinkedList уникальные слова, но через интерфейс Collection
        int k = 1;
        for (String s : c) {                // foreach работает для любого объекта с интерфейсом Collection
            System.out.printf("%-12s",s);
            if (k++ % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nUser Class with Iterable Interface:");
        RodentIt rodentIt = new RodentIt(24); // 24 грызуна создали
        k = 1;
        for (Rodent rodent : rodentIt) {
            System.out.printf("%-24s",rodent);
            if (k++ % 6 == 0) {
                System.out.println();
            }
        }

    }
}
