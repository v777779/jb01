package ch03.ex07;

import java.util.Random;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Coin {
    boolean state;
    Random rnd;


    public Coin() {
        rnd = new Random();
    }

    String getState() {
        state = rnd.nextBoolean(); // false or true
        if (state) {
           return ("tail");
        }
        return "head";
    }


}
