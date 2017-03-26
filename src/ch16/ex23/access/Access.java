package ch16.ex23.access;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 23 Array Sort Check\n");
        Random rnd = new Random();
        Integer[] ints = new Integer[25];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rnd.nextInt(100);  // автоматическая упаковка
        }
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints, new CompRev());
        System.out.println(Arrays.toString(ints));


    }
}
