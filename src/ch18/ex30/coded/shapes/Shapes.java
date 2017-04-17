package ch18.ex30.coded.shapes;

import java.io.Serializable;
import java.util.Random;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public abstract class Shapes implements Serializable {
    public static final int RED = 1, BLUE = 2, GREEN = 3;
    private static Random rnd = new Random();
    private static int counter = 0;

    private int xPos, yPos, dimension;

    public abstract void setColor(int color);

    public abstract int getColor();

    public Shapes(int xPos, int yPos, int dimension) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.dimension = dimension;
    }

    public static Shapes randomFactory() {
        int xVal = rnd.nextInt(100);
        int yVal = rnd.nextInt(100);
        int dim = rnd.nextInt(100);
        switch (counter++ % 3) {
            default:
            case 0:
                return new CircleS(xVal, yVal, dim);
            case 1:
                return new SquareS(xVal, yVal, dim);
            case 2:
                return new LineS(xVal, yVal, dim);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " color[" + getColor() +
                "] xPos[" + xPos + "] yPos[" + yPos + "] dim[" +
                dimension + "]\n";
    }
}
