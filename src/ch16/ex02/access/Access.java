package ch16.ex02.access;

import lib.utils.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static BerylliumSphere[] getArray(int size) {
        BerylliumSphere[] bArray = new BerylliumSphere[size];
        for (int i = 0; i < bArray.length; i++) {
            bArray[i] = new BerylliumSphere();

        }
        return bArray;
    }
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 2 Return of Array Check\n");

        System.out.println("b:"+ Arrays.toString(getArray(5)));
        System.out.println("b:"+ Arrays.toString(getArray(3)));
        System.out.println("b:"+ Arrays.toString(getArray(7)));

    }
}
