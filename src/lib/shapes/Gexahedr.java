package lib.shapes;

import lib.utils.IFactory;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Gexahedr extends Shape {
    public Gexahedr() {
    }

    public static class Factory implements IFactory {
        @Override
        public Gexahedr create() {
            return new Gexahedr();
        }
    }

    public void draw() {
        System.out.println("Draw.Gexahedr");
    }

    public void rotate() {
        System.out.println("Rotate.Gexahedr");
    }

    public void erase() {
        System.out.println("Erase.Gexahedr");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Gexahedr");
        super.dispose();

    }
}
