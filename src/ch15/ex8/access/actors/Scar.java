package ch.ex8.access.actors;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Scar extends BadGuys {

    public static class Factory implements IFactory<Scar> {
        @Override
        public Scar create() {
            return new Scar();
        }
    }

}
