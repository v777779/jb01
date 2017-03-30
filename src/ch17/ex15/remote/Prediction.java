package ch17.ex15.remote;

import java.util.Random;

/**
 * Created by V1 on 30-Mar-17.
 */
public class Prediction {
    private Random rnd = new Random();
    private boolean shadow = rnd.nextDouble() > 0.5; // тень сурка

    @Override
    public String toString() {
        if (shadow) {
            return "Long  Winter";
        } else {
            return "Early Spring";
        }
    }
}
