package ch16.ex14.access;

import lib.generate.GenSeq;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 14 Primitive Array Generator Check\n");
        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 =  new char[size];
        short[] a4 = new short[size];
        int[] a5 =  new int[size];
        long[] a6 =  new long[size];
        float[] a7 =  new float[size];
        double[] a8 =  new double[size];

        a1 = GenSeq.get(a1) ;
        a2 = GenSeq.get(a2) ;
        a3 = GenSeq.get(a3) ;
        a4 = GenSeq.get(a4) ;
        a5 = GenSeq.get(a5) ;
        a6 = GenSeq.get(a6) ;
        a7 = GenSeq.get(a7) ;
        a8 = GenSeq.get(a8) ;

        System.out.println("boolean:"+ Arrays.toString(a1));
        System.out.println("byte   :"+Arrays.toString(a2));
        System.out.println("char   :"+Arrays.toString(a3));
        System.out.println("short  :"+Arrays.toString(a4));
        System.out.println("int    :"+Arrays.toString(a5));
        System.out.println("long   :"+Arrays.toString(a6));
        System.out.println("float  :"+Arrays.toString(a7));
        System.out.println("double :"+Arrays.toString(a8));

    }
}
