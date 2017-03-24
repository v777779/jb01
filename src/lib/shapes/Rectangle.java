package lib.shapes;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Rectangle extends Shape {
    public Rectangle() {
    }
    public static class Factory implements IFactory {
        @Override
        public Rectangle create() {
            return new Rectangle();
        }
    }

    public void draw() {
        System.out.println("Draw.Rectangle");
    }
    public void rotate() {
        System.out.println("Rotate.Rectangle");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Rectangle");
        super.dispose();

    }
}
