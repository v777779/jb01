package ch17.ex35.access;

import lib.maps.SlowMap;
import lib.tests.MapCheck;
import lib.tests.Tester;

import java.util.TreeMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 35 SlowMapEntry Test Check\n");

        Tester.run(new TreeMap<>(), MapCheck.tests);
        Tester.run(new SlowMap<>(), MapCheck.tests);


    }
}
