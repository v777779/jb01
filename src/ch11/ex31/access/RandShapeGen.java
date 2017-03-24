package ch11.ex31.access;

import lib.shapes.Circle;
import lib.shapes.Shape;
import lib.shapes.Square;
import lib.shapes.Triangle;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by V1 on 28-Feb-17.
 */
public class RandShapeGen implements Iterable<Shape> {
    private Random rnd = new Random();
    private int size;

    public RandShapeGen(int size) {
        this.size = size;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {

                return index < size;
            }

            @Override
            public Object next() {
                Shape shape;
                switch (rnd.nextInt(3)) {
                    default:
                    case 0:
                        shape = new Circle();
                        break;
                    case 1:
                        shape = new Square();
                        break;
                    case 2:
                        shape = new Triangle();
                        break;
                }
                index++;
                return shape;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
