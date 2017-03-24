package ch14.ex15.access.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Cymr extends Cat {
    public Cymr() {
        super();
    }

    public static class Factory implements IFactory<Cymr> {
        @Override
        public Cymr create() {
            return new Cymr();
        }
    }


    public Cymr(String name) {
        super(name);
    }


}
