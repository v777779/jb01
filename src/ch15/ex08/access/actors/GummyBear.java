package ch15.ex08.access.actors;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class GummyBear extends GoodGuys {

    public static class Factory implements IFactory<GummyBear> {
        @Override
        public GummyBear create() {
            return new GummyBear();
        }
    }

}
