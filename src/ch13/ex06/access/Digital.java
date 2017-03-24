package ch13.ex06.access;

import java.util.Random;

/**
 * Created by V1 on 06-Mar-17.
 */
public class Digital {
    private int valInt;
    private long valLong;
    private float valFloat;
    private double valDouble;

    public Digital() {
        Random rnd = new Random();
        valInt = rnd.nextInt(100);
        valLong = rnd.nextInt(100);
        valFloat = rnd.nextFloat()*100;
        valDouble = rnd.nextDouble()*100;
    }


    @Override
    public String toString() {
        return String.format("int:%2d long: %2d float: %5.2f double: %5.2f",
                                valInt,valLong,valFloat,valDouble);
    }
}
