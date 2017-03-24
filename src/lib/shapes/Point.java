package lib.shapes;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Point extends Shape {
    public Point() {
    }

    public static class Factory implements IFactory {
        @Override
        public Point create() {
            return new Point();
        }
    }

    public void draw() {
        System.out.println("Draw.Point");
    }

    public void erase() {
        System.out.println("Erase.Point");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Point");
        super.dispose();

    }
}
