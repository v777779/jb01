package lib.figures;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Cube extends Shape {
    public Cube() {
    }
    public static class Factory implements IFactory {
        @Override
        public Cube create() {
            return new Cube();
        }
    }

    public void draw() {
       System.out.println("Draw.Cube");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Cube");
        super.dispose();

    }
}
