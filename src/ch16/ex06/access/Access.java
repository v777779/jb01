package ch16.ex06.access;

import lib.utils.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static BerylliumSphere[][] get(int[] size) {
        BerylliumSphere[][] a = new BerylliumSphere[size[0]][size[1]];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new BerylliumSphere();
            }
        }
        return a;
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 6 MultiDim Array Check\n");
        System.out.println("BerylliumSphere[][]:");
        System.out.println(Arrays.deepToString(get(new int[]{5,2})));
    }
}
