package ch16.ex07.access;

import lib.utils.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static BerylliumSphere[][][] get(int[] size) {
        BerylliumSphere[][][] a = new BerylliumSphere[size[0]][size[1]][size[2]];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return a;
    }


    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 7 Multidimensional Array Check\n");

        System.out.println("BerylliumSphere[][][]:");
        System.out.println(Arrays.deepToString(get(new int[]{3,2,2})));

    }
}
