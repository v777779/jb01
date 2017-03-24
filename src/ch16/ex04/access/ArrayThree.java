package ch16.ex04.access;

import java.util.Random;

/**
 * Created by V1 on 23.03.2017.
 */
public class ArrayThree {
    public static double[][][] get(int[] size, int[] lim) {
        Random rnd = new Random();
        double [][][] a = new double[ size[0]][size[1]][size[2]];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = (rnd.nextDouble() * (lim[1] - lim[0])) + lim[0];
                }
            }
        }
        return a;
    }

    public static void show(double[][][] a) {
        System.out.println("Double Array: [");

        for (double[][] doubles : a) {
            System.out.print("[");
            for (double[] aDouble : doubles) {
                System.out.print("[");
                for (double v : aDouble) {
                    System.out.printf("%5.3f, ",v);
                }
                System.out.print("]");
            }
            System.out.println("],");
        }
        System.out.println("]");
    }




}
