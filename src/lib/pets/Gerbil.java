package lib.pets;

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

    public Gerbil(String name) {
        super(name);
    }


}
