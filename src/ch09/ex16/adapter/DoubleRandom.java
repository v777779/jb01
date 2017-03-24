package ch.ex16.adapter;

import java.util.Random;

/**
 * Created by V1 on 14-Feb-17.
 */
public class DoubleRandom {
    private static Random rnd = new Random();
    public static double next() {
        return rnd.nextDouble();
    }
}
