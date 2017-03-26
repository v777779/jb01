package ch16.ex11.access;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 11 Array AutoPack Check\n");
        int[] aInt  = {1,2,3,4,5,6,7,8,9,10};
        Integer[] bInt = new Integer[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(aInt));
        System.out.println(Arrays.toString(bInt));
//        aInt = bInt; не работает
//        bInt = aInt; не работает
    }
}
