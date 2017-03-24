package ch16.ex03.include;

import java.util.Arrays;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nMultidimensional Array Check\n");

        System.out.println("Aggregate Init and Autoboxing:");
        Integer[][] a = {  // autoboxing
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80}
        };
        System.out.println("a:" + Arrays.deepToString(a));

        System.out.println("Sequential Init and Autoboxing:");
        Integer[][] b;
        b = new Integer[3][];  //
        for (int i = 0; i < b.length; i++) {
            b[i] = new Integer[3];
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = i * j;  // autoboxing
            }
        }
        System.out.println("b:" + Arrays.deepToString(b));

        System.out.println("Aggregate Init Autoboxing:");
        Integer[][] a1 = {  // autoboxing
                {1, 2, 3,},
                {4, 5, 6,},
        };
        Double[][][] a2 = {  // autoboxing
                {{1.1, 2.2}, {3.3, 4.4}},
                {{5.5, 6.6}, {7.7, 8.8}},
                {{9.9, 1.2}, {2.3, 3.4}},
        };
        String[][] a3 = {
                {"The", "Quick", "Sly", "Fox"},
                {"Jumped", "Over",},
                {"The", "Lazy", "Brown", "Dog", "and", "friend"},
        };

        System.out.println("a1:"+Arrays.deepToString(a1));
        System.out.println("a2:"+Arrays.deepToString(a2));
        System.out.println("a3:"+Arrays.deepToString(a3));


    }
}
