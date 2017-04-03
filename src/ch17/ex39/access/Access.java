package ch17.ex39.access;

import lib.generate.GenMap;
import lib.maps.SimpleHashMap;
import lib.tests.MapCheck;
import lib.tests.TestParam;
import lib.tests.Tester;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 39 SimpleHashMap Check\n");

        SimpleHashMapR<Integer, Integer> sMap = new SimpleHashMapR<>();
        sMap.putAll(GenMap.getInt(10000, 50));
        sMap.put(25, 15);
        System.out.println("size:" + sMap.size() + " " + sMap.capacity() + " " );


        Tester.defaultParams = TestParam.array(
                10, 5000, 100, 1000, 200, 500, 500, 200
        );

        Tester.run(new SimpleHashMap<>(), MapCheck.tests);
        Tester.run(new SimpleHashMapR<>(), MapCheck.tests);


    }
}
