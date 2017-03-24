package ch.ex8.access.actors;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Jafar extends BadGuys {

    public static class Factory implements IFactory<Jafar> {
        @Override
        public Jafar create() {
            return new Jafar();
        }
    }
}
