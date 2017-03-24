package ch.ex8.access.actors;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Scrooge extends BadGuys {

    public static class Factory implements IFactory<Scrooge> {
        @Override
        public Scrooge create() {
            return new Scrooge();
        }
    }

}
