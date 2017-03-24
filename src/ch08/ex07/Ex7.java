package ch08.ex07;

import ch08.ex07.local.*;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex7 {
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[]{
                new Wind(),
                new Stringed(),
                new Percussion(),
                new WoodWind(),
                new Brass(),
                new Vilolin(),
                new Trumpet(),
                new Flute()
        };
        System.out.println("\n Polymorphism Check\n");

        for (Instrument instrument : orchestra) {
            System.out.println(instrument);
        }
    }
}
