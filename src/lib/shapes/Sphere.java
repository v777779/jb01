package lib.shapes;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Sphere extends Shape {
    public Sphere() {
    }

    public static class Factory implements IFactory {
        @Override
        public Sphere create() {
            return new Sphere();
        }
    }

    public void draw() {
        System.out.println("Draw.Sphere");
    }

    public void rotate() {
        System.out.println("Rotate.Sphere");
    }

    public void erase() {
        System.out.println("Erase.Sphere");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Sphere");
        super.dispose();

    }
}
