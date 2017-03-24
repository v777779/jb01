package ch.ex8.access.actors;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Cruella extends BadGuys {

    public static class Factory implements IFactory<Cruella> {
        @Override
        public Cruella create() {
            return new Cruella();
        }
    }
}
