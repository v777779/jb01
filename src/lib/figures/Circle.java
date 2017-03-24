package lib.figures;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Circle extends Shape {
    public Circle() {
    }

    public static class Factory implements IFactory {
        @Override
        public Circle create() {
            return new Circle();
        }
    }


    public void draw() {
        System.out.println("Draw.Circle");
    }
    public void rotate() {
        System.out.println("Rotate.Circle");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Circle");
        super.dispose();

    }
}
