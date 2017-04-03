package ch17.ex38.access;

import lib.generate.GenMap;
import lib.tests.MapCheck;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.HashMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 38 HashMap Check\n");
//        Factor.LoadTest(32);

            HashMap<Integer, Integer> hMap = GenMap.getIntSec(756);
           System.out.println("load:" + hMap.size()+" "+Factor.capacity(hMap)+" "+Factor.get(hMap));
            Tester.defaultParams = TestParam.array(
                    1800, 50  // size, loops
            );
            Tester.run(hMap, MapCheck.tests.subList(1, 2));

            HashMap<Integer, Integer> hMap2 =  new HashMap<>(4096);
            hMap2.putAll(hMap);
            System.out.println("load:" + hMap2.size()+" "+Factor.capacity(hMap2)+" "+Factor.get(hMap2));
           Tester.run(hMap2, MapCheck.tests.subList(1, 2));


    }
}
