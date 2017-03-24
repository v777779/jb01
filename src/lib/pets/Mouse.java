package lib.pets;

import lib.utils.IFactory;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Mouse extends Rodent {
    public Mouse() {
        super();
    }
    public static class Factory implements IFactory<Mouse> {
        @Override
        public Mouse create() {
            return new Mouse();
        }
    }

    public Mouse(String name) {
        super(name);
    }


}
