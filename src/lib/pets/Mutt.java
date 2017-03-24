package lib.pets;

import lib.utils.IFactory;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Mutt extends Dog {
    public Mutt() {
        super();
    }
    public static class Factory implements IFactory<Mutt> {
        @Override
        public Mutt create() {
            return new Mutt();
        }
    }

    public Mutt(String name) {
        super(name);
    }


}
