package ch15.ex40.access.pets;

import lib.utils.IFactory;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Rat extends Rodent {
    public Rat() {
        super();
    }

    public static class Factory implements IFactory<Rat> {
        @Override
        public Rat create() {
            return new Rat();
        }
    }

    public void speak() {
        System.out.println("Rat.speak");
    }

    public Rat(String name) {
        super(name);
    }


}
