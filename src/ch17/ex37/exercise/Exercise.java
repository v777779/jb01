package ch17.ex37.exercise;

import lib.maps.SimpleHashMap;
import lib.tests.MapCheck;
import lib.tests.TestParam;
import lib.tests.Tester;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 03-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 37 Map Check\n");

        Tester.defaultParams = TestParam.array(
                10, 5000, 100, 5000, 200, 500, 500, 250
        );
        Tester.run(new SimpleHashMap<>(), MapCheck.tests);
        Tester.run(new SimpleHashMapA<>(), MapCheck.tests);
    }
}
