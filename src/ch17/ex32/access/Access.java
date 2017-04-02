package ch17.ex32.access;

import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 32 Check\n");
        Tester.defaultParams = TestParam.array(
                10,5000,100,5000,1000,1000,5000,200
        );
        TInt.testList(new ArrayList<>());
        TInt.testList(new LinkedList<>());
        TInt.testArray(new ContInt());



    }
}
