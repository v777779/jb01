package ch17.ex36.exercise;

import lib.tests.MapCheck;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.TreeMap;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 03-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 36 SlowMapEntry Check\n");
        Tester.defaultParams = TestParam.array(
                    100, 5000);

        Tester.run(new TreeMap<>(), MapCheck.tests);
        Tester.run(new SlowMapEntry<>(), MapCheck.tests);
        Tester.run(new SlowMapEntrySort<>(), MapCheck.tests);
    }
}
