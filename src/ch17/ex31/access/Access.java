package ch17.ex31.access;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {


    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 31 Array String Check\n");
        TString.testList(new ArrayList<>());
        TString.testList(new LinkedList<>());
        TString.testArray(new ContString());


    }
}
