package ch16.ex22.local;

import lib.generate.Gen;
import lib.generate.GenRnd;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nArray Sort Check\n");
        String []sa = Gen.getArray(new String[20], new GenRnd.GenStr(5));
        System.out.println("unsorted:"+Arrays.toString(sa));
        Arrays.sort(sa);
        System.out.println("sorted  :"+Arrays.toString(sa));


    }
}
