package ch08.ex2.local;

import java.util.Random;

/**
 * Created by V1 on 09-Feb-17.
 */
public class GenRandom {
    private Random rnd = new Random();

    public Shape next() {
        switch (rnd.nextInt(3)) {
            default:
                return null;
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

}
