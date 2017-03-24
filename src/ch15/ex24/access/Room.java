package ch15.ex24.access;

import lib.utils.IFactory;

/**
 * Created by V1 on 17.03.2017.
 */
public class Room extends House {
    public static class Factory implements IFactory<Room> {
        @Override
        public Room create() {
            return new Room();
        }
    }

}
