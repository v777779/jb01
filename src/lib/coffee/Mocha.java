package lib.coffee;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Mocha extends Coffee {

    public static class Factory implements IFactory<Mocha> {
        @Override
        public Mocha create() {
            return new Mocha();
        }
    }

}
