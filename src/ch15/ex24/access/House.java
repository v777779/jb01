package ch.ex24.access;

import lib.utils.IFactory;

/**
 * Created by V1 on 17.03.2017.
 */
public class House extends Building {

    public static class Factory implements IFactory<House> {
        @Override
        public House create() {
            return new House();
        }
    }

}
