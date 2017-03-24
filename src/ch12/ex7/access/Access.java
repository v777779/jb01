package ch12.ex7.access;

import lib.utils.Time;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 7 Message Check\n");
        int[] ints = new int[]{0,1 ,2,3,4};
        System.out.println(Arrays.toString(ints));

        Time.sleep();

        try {
            System.err.println("Try Block started");
             ints[12] = 12;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Catch block started");
             e.printStackTrace();
            System.err.println("Exception: Index Out of Bounds");
        }

        Time.sleep();
        System.out.println(Arrays.toString(ints));

    }
}
