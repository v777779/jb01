package ch17.ex01.thrown;

import lib.maps.CListInt;
import lib.maps.CMapInt;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Thrown {
    public static void app() {
        System.out.println("\n====THROWN===");
        System.out.println("\nAbstractList Generator Check\n");

        System.out.println("List Generator based on AbstractList:");
        CListInt cList = new CListInt(25);
        System.out.println(cList);

        System.out.println("List Generator based on AbstractList:");
        CMapInt cMap = new CMapInt(25);
        System.out.println(cMap);

    }
}
