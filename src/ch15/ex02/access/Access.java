package ch15.ex02.access;

import lib.coffee.Coffee;
import lib.coffee.CoffeeGen;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 2 Generics Check\n");
        Holder4<Coffee> h4 = new Holder4<>(CoffeeGen.randomCoffee(),CoffeeGen.randomCoffee(),CoffeeGen.randomCoffee());
        System.out.println("h4.a:"+h4.getA());
        System.out.println("h4.b:"+h4.getB());
        System.out.println("h4.c:"+h4.getC());


    }
}
