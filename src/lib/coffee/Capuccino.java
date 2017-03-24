package lib.coffee;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Capuccino extends Coffee {

    public static class Factory implements IFactory<Capuccino> {
        @Override
        public Capuccino create() {
            return new Capuccino();
        }
    }

}
