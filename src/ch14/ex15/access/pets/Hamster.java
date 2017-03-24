package ch14.ex15.access.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Hamster extends Rodent {
    public Hamster() {
        super();
    }
    public static class Factory implements IFactory<Hamster> {
        @Override
        public Hamster create() {
            return new Hamster();
        }
    }

    public Hamster(String name) {
        super(name);
    }


}