package ch17.ex29.access;

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
        System.out.println("\nExercise 29 Check\n");

        Tester.defaultParams = TestParam.array(
                10,5000,100,5000,1000,1000,10000,200
        );
        ListTesterS.run(new ArrayList<>(),ListCheckS.tests);
        ListTesterS.run(new LinkedList<>(),ListCheckS.tests);

        Tester.fieldWidth = 12; // для очередей
        Tester<LinkedList<String>> qTest = new Tester<LinkedList<String>>(new LinkedList<>(),QueueCheckS.tests);
        qTest.setHeadLine("Queue<String> Tests");
        qTest.timedTests();

        System.out.println("\nOffice solution:");
        Tester.fieldWidth = 8; // по умолчанию
        ListTesterS.run(new ArrayList<>(),ListCheckSOffice.tests);
        ListTesterS.run(new ArrayList<>(),ListCheckSOffice.tests);
        Tester.fieldWidth = 12; // для очередей
        qTest = new Tester<LinkedList<String>>(new LinkedList<>(),QueueCheckS.tests);
        qTest.setHeadLine("Queue<String> Tests");
        qTest.timedTests();

    }
}
