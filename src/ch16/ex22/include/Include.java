package ch16.ex22.include;

import lib.generate.ConvTo;
import lib.generate.Gen;
import lib.generate.GenRnd;

import java.util.Arrays;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nSearching in Sorted Array Check\n");
        GenRnd.GenInt cg = new GenRnd.GenInt();
        int [] aInt = ConvTo.primitive(Gen.getArray(new Integer[25],cg)); // сгенерили массив aInt[]
        System.out.println(Arrays.toString(aInt));
        Arrays.sort(aInt);
        System.out.println(Arrays.toString(aInt));
        while (true) {
            int rndVal = cg.next(); // следюущее Int
            int pos = Arrays.binarySearch(aInt,rndVal);
            if (pos >= 0) {
                System.out.println("Location of "+rndVal+ " is "+ pos+
                " , aInt["+pos+"] = "+aInt[pos]);
                break;
            }
        }
    }
}
