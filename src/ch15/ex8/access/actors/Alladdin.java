package ch.ex8.access.actors;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Alladdin extends GoodGuys {

    public static class Factory implements IFactory<Alladdin> {
        @Override
        public Alladdin create() {
            return new Alladdin();
        }
    }

}
