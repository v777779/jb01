package ch15.ex08.access.actors;

import lib.utils.IFactory;

/**
 * Created by V1 on 10-Mar-17.
 */
public class MikiMouse extends GoodGuys {

    public static class Factory implements IFactory<MikiMouse> {
        @Override
        public MikiMouse create() {
            return new MikiMouse();
        }
    }

}
