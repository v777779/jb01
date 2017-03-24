package ch16.ex05.access;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 5 Multidimensional Array Init Check\n");
        Integer[][] ints = new Integer[5][4];
        System.out.println("ints:"+ Arrays.deepToString(ints));
    }
}
