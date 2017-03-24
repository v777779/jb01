package ch13.ex08.access;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 8 RegEx Check\n");
        String s = "Then, when you have found the shrubbery, you must " +
                "cut down the mightiest tree in the forest... " +
                "with... a herring!";

        System.out.println(Arrays.toString(s.split("(the|you)")));
    }
}
