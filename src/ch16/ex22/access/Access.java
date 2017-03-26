package ch16.ex22.access;

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
        System.out.println("\nExercise 22 Unsorted Array Searching Check\n");
        System.out.println("Integer value Searching:");
        for (int i = 0; i < 10; i++) {
            int[] aInt = ConvTo.primitive(Gen.getArray(new Integer[25], new GenRnd.GenInt())); // сгенерили массив aInt[]
            int value = aInt[20];
            System.out.println("unsorted:" + Arrays.binarySearch(aInt, value));
            Arrays.sort(aInt);

            System.out.println("sorted  :" + Arrays.binarySearch(aInt, value));
        }

        System.out.println("\nString value Searching:");
        for (int i = 0; i < 5; i++) {
            String[] aStr = Gen.getArray(new String[25], new GenRnd.GenStr(7)); // сгенерили массив aStr[]
            String s = aStr[20];
            System.out.println("unsorted:" + Arrays.binarySearch(aStr, s));
            Arrays.sort(aStr);

            System.out.println("sorted  :" + Arrays.binarySearch(aStr, s));

        }

    }
}
