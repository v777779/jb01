package ch15.ex15.access;

import ch15.ex15.local.tuples.TupleTest;
import ch15.ex15.local.tuples.TwoTuple;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 15 Tuple w Generic  Check\n");
        TwoTuple<String,Integer> ttsi = TupleTest.f();
        TwoTuple<String,Integer> ttdi = TupleTest.f2();
        TwoTuple ttmi = TupleTest.f2();

        System.out.println(ttsi);  //2   параметризованный в параметризованный ok
        System.out.println(ttdi);  //2   не параметризованный  в параметризованный
        System.out.println(ttmi);  //2   не параметризованный в непараметризованный

    }
}
