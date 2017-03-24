package lib.coffee;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Americano extends Coffee {

    public static class Factory implements IFactory<Americano> {
        @Override
        public Americano create() {
            return new Americano();
        }
    }

}
