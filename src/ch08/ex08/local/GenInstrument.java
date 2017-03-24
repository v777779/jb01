package ch08.ex08.local;

import ch08.ex07.local.*;

import java.util.Random;

/**
 * Created by V1 on 09-Feb-17.
 */
public class GenInstrument {
    private static Random rnd = new Random();

    public static Instrument next() {
        switch (rnd.nextInt(8)) {
            case 0:
                return new Wind();
            case 1:
                return new Stringed();
            case 2:
                return new Percussion();
            case 3:
                return new WoodWind();
            case 4:
                return new Brass();
            case 5:
                return new Vilolin();
            case 6:
                return new Trumpet();
            case 7:
                return new Flute();
            default:
//                return new Instrument();
        }
        return new Instrument();
      }
}
