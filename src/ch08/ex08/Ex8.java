package ch08.ex08;

import ch08.ex07.local.Instrument;
import ch08.ex08.local.GenInstrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex8 {
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[10];

        System.out.println("\n Exercise 8 Polymorphism Check\n");
        for (int i = 0; i < orchestra.length; i++) {
             orchestra[i] = GenInstrument.next();
        }
        for (Instrument instrument : orchestra) {
            System.out.println(instrument);
        }


    }
}
