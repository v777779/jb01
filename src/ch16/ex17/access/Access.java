package ch16.ex17.access;

import lib.generate.Gen;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 17 BigDecimal Generator Check\n");

        BigDecimal[] aBig = new BigDecimal[10];
        aBig = Gen.getArray(aBig, new GenBig(5));
        BigDecimal[] bBig = Gen.getArray(BigDecimal.class, new GenBig(), 10);
        System.out.println("BigDecimal Link  aBig:"+Arrays.toString(aBig));
        System.out.println("BigDecimal Array bBig:"+Arrays.toString(bBig));


    }
}
