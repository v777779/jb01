package ch08.ex09.local;

import java.util.Random;

/**
 * Created by V1 on 09-Feb-17.
 */
public class GenRodent {
    private static Random rnd = new Random();

    public static Rodent next() {
        switch (rnd.nextInt(6)) {
            case 0:
                return new FieldMouse();
            case 1:
                return new Hamster();
            case 2:
                return new HouseMouse();
            case 3:
                return new Muskrat();
            case 4:
                return new NorwayRat();
            case 5:
                return new Nutria();
            default:
//                return new Instrument();
        }
        return new Rodent();
    }
}
