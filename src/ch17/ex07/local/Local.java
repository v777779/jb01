package ch17.ex07.local;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nList Methods Check\n");

        List<String> aList = (Arrays.asList("Check", "Algo"," MakeLater","Link","BlastRobot"));


        ListMethods.listCheck(new ArrayList<>(aList));
        ListMethods.listCheck(new LinkedList<>(aList));

        ListMethods.iterMotion(new ArrayList<>(aList));
        ListMethods.iterMotion(new LinkedList<>(aList));

        ListMethods.iterAction(new ArrayList<>(aList));
        ListMethods.iterAction(new LinkedList<>(aList));

        ListMethods.checkVisual(new ArrayList<>(aList));
        ListMethods.checkVisual(new LinkedList<>(aList));

        ListMethods.checkLinkedList();



    }
}
