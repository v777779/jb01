package ch17.ex35.exercise;

import lib.maps.SlowMap;
import lib.maps.SlowMap2;
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
        System.out.println("\nExercise 35 SlowMapEntry Test Check\n");

        Tester.run(new TreeMap<>(), MapCheck.tests);
        Tester.run(new SlowMap<>(), MapCheck.tests, TestParam.array(10, 5000, 100, 5000));
        Tester.run(new SlowMap2<>(), MapCheck.tests, TestParam.array(10, 5000, 100, 5000));


    }
}
