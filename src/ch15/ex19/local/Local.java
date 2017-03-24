package ch15.ex19.local;

import lib.coffee.Coffee;
import lib.pets.Pet;
import lib.tuples.FourTuple;
import lib.tuples.TupleTest;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nTuple w Generic Check\n");
        TupleList<Coffee, Pet,String, Integer> tlist = new TupleList<>();
        tlist.add(TupleTest.h());
        tlist.add(TupleTest.h());
        tlist.add(TupleTest.h());
        tlist.add(TupleTest.h());
        for (FourTuple<Coffee, Pet, String, Integer> t : tlist) {
            System.out.println(t);
        }

    }
}
