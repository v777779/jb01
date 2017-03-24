package ch13.ex14.access;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 14 split()  Check\n");
        String s = "This!!unusual use!!of exclamation!!points";
        String[] a1 = s.split("!!");        // простое разбиение
        String[] a2 = s.split("!!",3); // ограничение длины
        System.out.println(Arrays.toString(a1)+" "+a1.length);
        System.out.println(Arrays.toString(a2)+" "+a2.length);

    }
}
