package lib.shapes;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Line extends Shape {
    public Line() {
    }

    public static class Factory implements IFactory {
        @Override
        public Line create() {
            return new Line();
        }
    }

    public void draw() {
        System.out.println("Draw.Line");
    }

    public void erase() {
        System.out.println("Erase.Line");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Line");
        super.dispose();

    }
}
