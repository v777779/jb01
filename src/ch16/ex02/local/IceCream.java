package ch16.ex02.local;

import java.util.Random;

/**
 * Created by V1 on 23.03.2017.
 */
public class IceCream {
    private static Random rnd = new Random();
    static final String[] FLAVORS = {
            "CHocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Moch Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length) {
            throw new RuntimeException("Set too big");
        }
        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t = rnd.nextInt(FLAVORS.length);
            while (picked[t]) {
                t = rnd.nextInt(FLAVORS.length);
            }
            results[i] = FLAVORS[t];
        }
        return results;


    }
}
