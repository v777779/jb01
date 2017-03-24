package ch15.ex40.access.pets;

import lib.utils.IFactory;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Gerbil extends Rodent {
    public Gerbil() {
        super();
    }

    public static class Factory implements IFactory<Gerbil> {
        @Override
        public Gerbil create() {
            return new Gerbil();
        }
    }

    public void speak() {
        System.out.println("Gerbil.speak");
    }

    public Gerbil(String name) {
        super(name);
    }


}
