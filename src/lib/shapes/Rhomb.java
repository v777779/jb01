package lib.shapes;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Rhomb extends Shape {
    public Rhomb() {
    }

    public static class Factory implements IFactory {
        @Override
        public Rhomb create() {
            return new Rhomb();
        }
    }

    public void draw() {
        System.out.println("Draw.Rhomb");
    }

    public void rotate() {
        System.out.println("Rotate.Rhomb");
    }

    public void erase() {
        System.out.println("Erase.Rhomb");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Rhomb");
        super.dispose();

    }
}
