package ch08.ex03.local;

import java.util.Random;

/**
 * Created by V1 on 09-Feb-17.
 */
public class GenRandom {
    private Random rnd = new Random();

    public Shape next() {
        switch (rnd.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return null;
        }
    }

}
