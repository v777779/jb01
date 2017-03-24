package ch.ex13.access;

import lib.coffee.*;
import lib.utils.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 13 Generic IGenerator Check\n");

        Collection<Coffee> col = Gens.fill(new ArrayList<>(), new CoffeeGen(),8);
        System.out.println(col);

        Collection<Integer> flist = Gens.fill(new ArrayList<>(), new Fibonacci(),8);  //
        System.out.println(flist);

        Collection<Integer> fset = Gens.fill(new TreeSet<>(), new Fibonacci(),8);
        System.out.println(fset);

//        конфликт между List/Queue
//        Collection<Integer> fset = Gens.fill(new LinkedList<Integer>(), new Fibonacci(),8);
//        System.out.println(col);
    }
}
