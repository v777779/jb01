package ch16.ex11.local;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nArrays.fill Check\n");
        System.out.println("Array fill with one value check");
        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        short[] a4 = new short[size];
        int[] a5 = new int[size];
        long[] a6 = new long[size];
        float[] a7 = new float[size];
        double[] a8 = new double[size];
        String[] a9 = new String[size];

        Arrays.fill(a1,true);
        Arrays.fill(a2,(byte)15);
        Arrays.fill(a3,'c');
        Arrays.fill(a4,(short)17);
        Arrays.fill(a5,19);
        Arrays.fill(a6,23L);
        Arrays.fill(a7,25.1F);
        Arrays.fill(a8,27.2);
        Arrays.fill(a9,"Hello");


        System.out.println("boolean:"+Arrays.toString(a1));
        System.out.println("byte   :"+Arrays.toString(a2));
        System.out.println("char   :"+Arrays.toString(a3));
        System.out.println("short  :"+Arrays.toString(a4));
        System.out.println("int    :"+Arrays.toString(a5));
        System.out.println("long   :"+Arrays.toString(a6));
        System.out.println("float  :"+Arrays.toString(a7));
        System.out.println("double :"+Arrays.toString(a8));
        System.out.println("String :"+Arrays.toString(a9));
        Arrays.fill(a9,3,5,"World");
        System.out.println("String :"+Arrays.toString(a9));


    }
}
