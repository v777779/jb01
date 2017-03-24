package lib.shapes;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Tetrahedr extends Shape {
    public Tetrahedr() {
    }

    public static class Factory implements IFactory {
        @Override
        public Tetrahedr create() {
            return new Tetrahedr();
        }
    }

    public void draw() {
        System.out.println("Draw.Tetrahedr");
    }

    public void rotate() {
        System.out.println("Rotate.Tetrahedr");
    }

    public void erase() {
        System.out.println("Erase.Tetrahedr");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Tetrahedr");
        super.dispose();

    }
}
