package ch14.ex15.access.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Pug extends Dog {
    public Pug() {
        super();
    }
    public static class Factory implements IFactory<Pug> {
        @Override
        public Pug create() {
            return new Pug();
        }
    }

    public Pug(String name) {
        super(name);
    }


}
