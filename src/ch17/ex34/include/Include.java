package ch17.ex34.include;

import lib.tests.SetCheck;
import lib.tests.Tester;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nSet Check\n");
        Tester.fieldWidth = 10; // for Set
        System.out.println("Set<Integer>:");
        Tester.run(new TreeSet<>(), SetCheck.tests);
        Tester.run(new HashSet<>(), SetCheck.tests);
        Tester.run(new LinkedHashSet<>(), SetCheck.tests);

    }
}
