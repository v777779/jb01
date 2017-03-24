package ch15.ex40.access.pets;

import lib.utils.IFactory;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Cymr extends Cat {
    public Cymr() {
        super();
    }

    public static class Factory implements IFactory<Cymr> {
        @Override
        public Cymr create() {
            return new Cymr();
        }
    }

    public void speak() {
        System.out.println("Cymr.speak");
    }

    public Cymr(String name) {
        super(name);
    }


}
