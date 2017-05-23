package ch22.ex28.exercise;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 22-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Cube {
    private Random rnd = new Random();
private int value;

    public int getValue() {
        value = rnd.nextInt(6)+1;
        return value;
    }

    public int getLast() {
        return value;
    }

}
