package lib.coffee;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Latte extends Coffee {

    public static class Factory implements IFactory<Latte> {
        @Override
        public Latte create() {
            return new Latte();
        }
    }

}
