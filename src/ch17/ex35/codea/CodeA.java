package ch17.ex35.codea;

import lib.tests.MapCheck;
import lib.tests.Tester;

import java.util.*;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 03-Apr-17.
 */
public class CodeA {
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
