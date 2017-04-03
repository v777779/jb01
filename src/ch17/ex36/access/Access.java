package ch17.ex36.access;

import lib.maps.SlowMap;
import lib.tests.MapCheck;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.TreeMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 36 SlowMapEntry Check\n");
        Tester.defaultParams = TestParam.array(
                    10, 5000, 100, 5000, 200, 500, 500, 250
        );

        SlowMapEntry<Integer,Integer> sMap = new SlowMapEntry<>();

        Tester.run(new TreeMap<>(), MapCheck.tests);
        Tester.run(new SlowMapEntry<>(), MapCheck.tests);
        Tester.run(new SlowMapEntrySort<>(), MapCheck.tests);
    }
}
