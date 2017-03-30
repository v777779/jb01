package ch17.ex15.integra;

import java.util.Random;

/**
 * Created by V1 on 30-Mar-17.
 */
public class Prediction {
    private static Random rnd = new Random();
    private static boolean shadow = rnd.nextDouble() > 0.5; // тень сурка

    @Override
    public String toString() {
        if (shadow) {
            return "Long  Winter";
        } else {
            return "Early Spring";
        }
    }
}
