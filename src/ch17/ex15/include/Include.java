package ch17.ex15.include;

import lib.maps.CMapInt;

import java.util.LinkedHashMap;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nLinkedHashMap Check\n");
        LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<>(new CMapInt(9));
        System.out.println(lhmap);
        System.out.println("LRU Order Demo:");
        lhmap = new LinkedHashMap<Integer,String>(16,0.75f,true);
        System.out.println(lhmap);
        lhmap.putAll(new CMapInt(9));
        System.out.println(lhmap);
        for (int i = 0; i < 6 ; i++) {
            lhmap.get(i); // иммитация обращения
        }
        System.out.println(lhmap); // перемещение элементов в конец списка
        lhmap.get(0);
        System.out.println(lhmap); // свежий элемент в самый конец

    }
}
