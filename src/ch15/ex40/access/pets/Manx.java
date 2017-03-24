package ch.ex40.access.pets;

import lib.utils.IFactory;

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

    public void speak() {
        System.out.println("Manx.speak");
    }

    public Manx(String name) {
        super(name);
    }


}
