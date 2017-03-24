package ch16.ex03.access;

import java.util.Random;

/**
 * Created by V1 on 23.03.2017.
 */
public class ArrayTwo {
    public static double[][] get(int x, int y, int min, int max) {
        Random rnd = new Random();
        double a[][] = new double[x][y];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] =  (rnd.nextDouble()*(max-min))+min;
            }
        }
        return a;
    }

    public static void show(double[][] a) {
        System.out.println("Double Array: [");
        for (double[] doubles : a) {
            System.out.print("[");
            for (double aDouble : doubles) {
                System.out.printf("%5.3f, ",aDouble);
            }
            System.out.println("],");
        }
        System.out.println("]");
    }




}
