package ch12.ex03.access;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 3 Exception Check\n");
        int[] ints = new int[]{0,1 ,2,3,4};
        System.out.println(Arrays.toString(ints));
        try {
            ints[12] = 12;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Index Out of Bounds");
        }
        System.out.println(Arrays.toString(ints));

    }
}
