package ch08.ex4.local;

import java.util.Random;

/**
 * Created by V1 on 09-Feb-17.
 */
public class GenRandom {
    private Random rnd = new Random();

    public Shape next() {
        switch (rnd.nextInt(8)) {
            default:
                return null;
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Hexagon();
            case 4:
                return new Line();
            case 5:
                return new Point();
            case 6:
                return new Rectangle();
            case 7:
                return new Ellipse();
        }
    }

}
