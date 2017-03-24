package ch15.ex13.include;

import lib.coffee.Coffee;
import lib.coffee.CoffeeGen;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nGeneric IGenerator Check\n");

        Collection<Coffee> col = Gens.fill(new ArrayList<>(), new CoffeeGen(),8);
        System.out.println(col);

        Collection<Integer> fib = Gens.fill(new TreeSet<Integer>(Collections.reverseOrder()), new Fibonacci(),8);
        System.out.println(fib);



    }
}
