package ch16.ex12.access;

import lib.generate.ConvTo;
import lib.generate.Gen;
import lib.generate.GenRnd;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12 Create primitive array w Generator Check\n");

        double[] doubles = ConvTo.primitive(Gen.getArray(Double.class, new GenRnd.GenDouble(),10));
        System.out.println(doubles.getClass().getSimpleName()+":"+Arrays.toString(doubles));
    }
}
