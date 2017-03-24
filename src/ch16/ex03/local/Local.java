package ch16.ex03.local;

import lib.utils.BerylliumSphere;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMultidimensional Array Check\n");
        int[][] a = {{1, 2, 3}, {4, 5, 6}
        };
        int[][][] b = new int[2][2][4];

        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));

        Random rnd = new Random();
        int[][][] c = new int[rnd.nextInt(7) + 1][][];
        System.out.println("c[dim][][]:" + c.length);
        for (int i = 0; i < c.length; i++) {
            c[i] = new int[rnd.nextInt(5) + 1][];
            System.out.print("c[" + i + "] " + c[i].length + " > ");
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = new int[rnd.nextInt(5) + 1];
                System.out.print("c[" + i + "][" + j + "] " + c[i][j].length + "   ");
            }
            System.out.println();
        }
        System.out.println("c:" + Arrays.deepToString(c));
        System.out.println("Object MultiDimension Array:");

        BerylliumSphere[][] spheres = {
                {
                        new BerylliumSphere(), new BerylliumSphere()
                },
                {
                        new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere()
                },
                {
                        new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere()
                },
        };

        System.out.println("spheres:"+Arrays.deepToString(spheres));
    }
}
