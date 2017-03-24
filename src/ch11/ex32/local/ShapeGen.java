package ch11.ex32.local;

import lib.shapes.*;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by V1 on 28-Feb-17.
 */
public class ShapeGen implements Iterable<Shape> {
    private Shape[] shapes;
    private Random rnd = new Random();
    private int size;

    public ShapeGen(int size) {
        this.size = size;
        shapes = getShapes();
    }

    private Shape[] getShapes() {
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = next();
        }
        return shapes;
    }
    private Shape next() {
        Shape shape;
        switch (rnd.nextInt(9)) {
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
            case 3:
                shape = new Gexahedr();
                break;
            case 4:
                shape = new Tetrahedr();
                break;
            case 5:
                shape = new Cube();
                break;
            case 6:
                shape = new Sphere();
                break;
            case 7:
                shape = new Line();
                break;
            case 8:
                shape = new Point();
                break;
        }
        return shape;
    }



    public Iterable<Shape> reversed() {   // забабахали новый адаптер

        return new Iterable<Shape>() {
            private int index = shapes.length -1; //  индекс реверсного итератора


            @Override
            public Iterator<Shape> iterator() {
                return new Iterator<Shape>() {
                    @Override
                    public boolean hasNext() {   // пока не равно -1 все нормально
                        return index > -1;
                    }

                    @Override
                    public Shape next() {
                        return shapes[index--];  // выдаем в обратном порядке
                    }
                };
            }
        };
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
            public Shape next() {
                return shapes[index++];  // обращение к классу родителю
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
