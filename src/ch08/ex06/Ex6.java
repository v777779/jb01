package ch08.ex06;

import ch08.ex06.local.*;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex6 {
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[]{
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };

        Music.tuneAll(orchestra);

        System.out.println("\n Exercise 6 Check Polymorphism\n");
        for (Instrument instrument : orchestra) {
            Music.what(instrument);
        }


    }
}
