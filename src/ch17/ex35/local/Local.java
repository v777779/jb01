package ch17.ex35.local;

import lib.tests.MapCheck;
import lib.tests.Tester;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMap Check\n");

        Tester.run(new TreeMap<>(), MapCheck.tests);
        Tester.run(new HashMap<>(),MapCheck.tests);
        Tester.run(new LinkedHashMap<>(),MapCheck.tests);
        Tester.run(new IdentityHashMap<>(),MapCheck.tests);
        Tester.run(new WeakHashMap<>(),MapCheck.tests);


    }
}
