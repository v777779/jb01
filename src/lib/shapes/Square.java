package lib.shapes;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Square extends Shape {
    public Square() {
    }

    public static class Factory implements IFactory {
        @Override
        public Square create() {
            return new Square();
        }
    }

    public void draw() {
        System.out.println("Draw.Square");
    }

    public void rotate() {
        System.out.println("Rotate.Square");
    }

    public void erase() {
        System.out.println("Erase.Square");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Square");
        super.dispose();

    }
}
