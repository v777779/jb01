package ch.ex7.local;

import lib.coffee.Coffee;
import lib.coffee.CoffeeGen;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nGeneric Check\n");
        CoffeeGen gen = new CoffeeGen();
        for (int i = 0; i < 5 ; i++) {
            System.out.print(gen.next()+" ");
        }
        System.out.println();

        for (Coffee coffee : new CoffeeGen(5)) {
            System.out.print(coffee+" ");
        }
        System.out.println();


    }
}
