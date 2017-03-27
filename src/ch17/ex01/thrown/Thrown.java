package ch17.ex01.thrown;

import lib.container.CIntList;
import lib.container.CIntMap;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Thrown {
    public static void app() {
        System.out.println("\n====THROWN===");
        System.out.println("\nAbstractList Generator Check\n");

        System.out.println("List Generator based on AbstractList:");
        CIntList cList = new CIntList(25);
        System.out.println(cList);

        System.out.println("List Generator based on AbstractList:");
        CIntMap cMap = new CIntMap(25);
        System.out.println(cMap);

    }
}
