package ch16.ex22.integra;

import lib.generate.Gen;
import lib.generate.GenRnd;

import java.util.Arrays;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nArray Sort w COmparator<> Check\n");

        String []sa = Gen.getArray(new String[20], new GenRnd.GenStr(5));
        System.out.println("unsorted :"+ Arrays.toString(sa));
        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
        System.out.println("sorted CA:"+Arrays.toString(sa));

        int index = Arrays.binarySearch(sa, sa[10], String.CASE_INSENSITIVE_ORDER);
        System.out.println("index:"+index+" "+sa[index]);


    }
}
