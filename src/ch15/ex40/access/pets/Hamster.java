package ch15.ex40.access.pets;

import lib.utils.IFactory;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Hamster extends Rodent {
    public Hamster() {
        super();
    }

    public static class Factory implements IFactory<Hamster> {
        @Override
        public Hamster create() {
            return new Hamster();
        }
    }

    public void speak() {
        System.out.println("Hamster.speak");
    }

    public Hamster(String name) {
        super(name);
    }


}
