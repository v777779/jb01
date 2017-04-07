package ch17.ex31.access;

import ch17.ex31.access.office.ContStringOffice;
import ch17.ex31.access.office.ListCheckOffice;
import ch17.ex31.access.office.StringCheckOffice;
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
        System.out.println("\nExercise 31 Array String Check\n");
        TString.testList(new ArrayList<>());
        TString.testList(new LinkedList<>());
        TString.testArray(new ContString());

        System.out.println("\nOfficial Solution:");

        Tester.run(new ArrayList<String>(), ListCheckOffice.tests,TestParam.array(1,1000));
        Tester.run(new ContStringOffice(), StringCheckOffice.tests,TestParam.array(1,1000));

    }
}
