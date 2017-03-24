package lib.pets;

import lib.utils.IFactory;

/**
 * Created by V1 on 09-Mar-17.
 */
public class EgCat extends Cat {
    public EgCat() {
        super();
    }

    public static class Factory implements IFactory<EgCat> {
        @Override
        public EgCat create() {
            return new EgCat();
        }
    }

    public EgCat(String name) {
        super(name);
    }


}
