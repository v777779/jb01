package ch16.ex20.access;

import lib.generate.ConvTo;
import lib.generate.GenSeq;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void fInt(int[][][] aInt) {
        GenSeq.GenInt cg = new GenSeq.GenInt();
        for (int i = 0; i < aInt.length; i++) {
            for (int j = 0; j < aInt[i].length; j++) {
                Integer[] aInteger = new Integer[aInt[i][j].length];
                for (int k = 0; k < aInteger.length; k++) {
                    aInteger[k] = cg.next();
                }
                aInt[i][j] = ConvTo.primitive(aInteger);
            }
        }
    }

    public static void fStr(String[][][] aStr) {
        GenSeq.GenStr cg = new GenSeq.GenStr();
        for (int i = 0; i < aStr.length; i++) {
            for (int j = 0; j < aStr[i].length; j++) {
                for (int k = 0; k < aStr[i][j].length; k++) {
                    aStr[i][j][k] = cg.next();
                }
            }
        }
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 20 MultiWim Equals Check\n");

        System.out.println("Array int[][][] create:");
        int[][][] aInt = new int[3][2][2];
        int[][][] bInt = new int[3][2][2];

        fInt(aInt);
        fInt(bInt);
        System.out.println("aInt[][][]:" + Arrays.deepToString(aInt));
        System.out.println("bInt[][][]:" + Arrays.deepToString(bInt));
        System.out.println("Arrays.deepEquals():"+Arrays.deepEquals(aInt,bInt));
        bInt[2][1][1] = 55;
        bInt[1][0][1] = 44;
        System.out.println("aInt[][][]:" + Arrays.deepToString(aInt));
        System.out.println("bInt[][][]:" + Arrays.deepToString(bInt));
        System.out.println("Arrays.deepEquals():"+Arrays.deepEquals(aInt,bInt));

        System.out.println("\nArray String[][][] create:");
        String[][][] aStr = new String[3][2][2];
        String[][][] bStr = new String[3][2][2];

        fStr(aStr);
        fStr(bStr);
        System.out.println("aInt[][][]:" + Arrays.deepToString(aStr));
        System.out.println("bInt[][][]:" + Arrays.deepToString(bStr));
        System.out.println("Arrays.deepEquals():"+Arrays.deepEquals(aStr,bStr));
        bStr[2][1][1] = "Hello";
        bStr[1][0][1] = "World";
        System.out.println("aInt[][][]:" + Arrays.deepToString(aStr));
        System.out.println("bInt[][][]:" + Arrays.deepToString(bStr));
        System.out.println("Arrays.deepEquals():"+Arrays.deepEquals(aStr,bStr));



    }
}
