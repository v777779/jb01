package ch14.ex15.access.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Manx extends Cat {
    public Manx() {
        super();
    }
    public static class Factory implements IFactory<Manx> {
        @Override
        public Manx create() {
            return new Manx();
        }
    }

    public Manx(String name) {
        super(name);
    }


}
