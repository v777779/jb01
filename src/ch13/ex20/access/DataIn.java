package ch13.ex20.access;

import java.util.Scanner;

/**
 * Created by V1 on 07-Mar-17.
 */
public class DataIn {
    private int valInt;
    private long valLong;
    private float valFloat;
    private double valDouble;
    private String valString;

    public DataIn(String s) {
        Scanner in = new Scanner(s.replace(","," ")); // входные данные

        valInt = in.nextInt();
        valLong = in.nextLong();
        valFloat = in.nextFloat();
        valDouble = in.nextDouble();
        valString = in.next("\\w+");

    }

    @Override
    public String toString() {
        return "DataIn:" +  valInt + " "+  valLong +" "+  valFloat +" "+
                valDouble +" "+   valString ;
    }
}
