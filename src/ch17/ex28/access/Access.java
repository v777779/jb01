package ch17.ex28.access;

import lib.tuples.Tuples;
import lib.tuples.TuplesTest;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 28 Tuples with hashCode() Check\n");

        Tuples.TwoTuple t2_1 = TuplesTest.f();
        Tuples.TwoTuple t2_2 = TuplesTest.f2();
        Tuples.SixTuple t6_1 = TuplesTest.m();
        Tuples.SixTuple t6_2 = TuplesTest.m();

        System.out.println("TwoTuple:");
        System.out.println("t2_1        :"+t2_1+" hashCode:"+t2_1.hashCode());
        System.out.println("t2_2        :"+t2_2+" hashCode:"+t2_2.hashCode());
        System.out.println("equals    1<>1:"+t2_1.equals(t2_1));
        System.out.println("compareTo 2<>2:"+t2_2.compareTo(t2_2));
        System.out.println("equals    1<>2:"+t2_1.equals(t2_2));
        System.out.println("compareTo 1<>2:"+t2_1.compareTo(t2_2));

        System.out.println("SixTuple:");
        System.out.println("t6_1          :"+t6_1+" hashCode:"+t6_1.hashCode());
        System.out.println("t6_2          :"+t6_2+" hashCode:"+t6_2.hashCode());
        System.out.println("equals    1<>1:"+t6_1.equals(t6_1));
        System.out.println("compareTo 2<>2:"+t6_2.compareTo(t6_2));
        System.out.println("equals    1<>2:"+t6_1.equals(t6_2));
        System.out.println("compareTo 1<>2:"+t6_1.compareTo(t6_2));



    }
}
