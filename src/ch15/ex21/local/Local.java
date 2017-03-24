package ch15.ex21.local;

import lib.pets.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nErasure Generics Check\n");
        Foo<Cat> fc = new Foo<>(new Cat());
        Foo<Dog> fd = new Foo<>(new Dog());

        System.out.println("fc.var:"+fc.getInfo());
        System.out.println("fd.var:"+fd.getInfo());

    }
}
