package ch.ex15.local;

import ch.ex15.local.tuples.TupleTest;
import ch.ex15.local.tuples.TwoTuple;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nTuple w Generics Check\n");
        TwoTuple<String,Integer> ttsi = TupleTest.f();
        TwoTuple<String,Integer> ttdi = TupleTest.f2();
        TwoTuple ttmi = TupleTest.f2();

        System.out.println(ttsi);  //2  параметризованный в параметризованный ok
        System.out.println(ttdi);  //2   не параметризованный  в параметризованный
        System.out.println(ttmi);  //2   не параметризованный в непараметризованный

        System.out.println(TupleTest.g());   //3
        System.out.println(TupleTest.h());   //4
        System.out.println(TupleTest.k());   //5


    }
}
