package ch.ex24.access;

import lib.utils.IFactory;

/**
 * Created by V1 on 17.03.2017.
 */
public class Building {
    public static class Factory implements IFactory<Building> {
        @Override
        public Building create() {
            return new Building();
        }
    }
}
