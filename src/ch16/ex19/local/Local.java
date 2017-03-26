package ch16.ex19.local;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nArrays.equals() Check\n");
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1, 15);
        Arrays.fill(a2, 15);
        System.out.println("Arrays.equals():" + Arrays.equals(a1, a2));
        a2[3] = 12;
        System.out.println("Arrays.equals():" + Arrays.equals(a1, a2));
        String[] s1 = new String[5];
        Arrays.fill(s1, "Hi");
        String[] s2 = {
                new String("Hi"), new String("Hi"),
                new String("Hi"), new String("Hi"),
                new String("Hi")
        };
        System.out.println("Arrays.equals():" + Arrays.equals(s1, s2));
        String [] s3 = {"Hi","Hi","Hi","Hi","Hi"};
        System.out.println("Arrays.equals():" + Arrays.equals(s2, s3));



    }
}
