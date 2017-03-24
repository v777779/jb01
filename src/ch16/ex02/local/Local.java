package ch16.ex02.local;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nreturn of Array Check\n");
        for (int i = 0; i < 7 ; i++) {
            System.out.println("flavorSet:"+ Arrays.toString(IceCream.flavorSet(3)));
        }

    }
}
