package ch15.ex40.access.pets;

import lib.utils.IFactory;

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

    public void speak() {
        System.out.println("Pug.speak");
    }

    public Pug(String name) {
        super(name);
    }


}
