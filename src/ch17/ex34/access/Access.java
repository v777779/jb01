package ch17.ex34.access;

import lib.tests.SetCheckS;
import lib.tests.Tester;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 34 Set<String> Test Check\n");
        Tester.fieldWidth = 10; // for Set
        System.out.println("Set<String>:");
        Tester.run(new TreeSet<>(), SetCheckS.tests);
        Tester.run(new HashSet<>(), SetCheckS.tests);
        Tester.run(new LinkedHashSet<>(), SetCheckS.tests);

    }
}
