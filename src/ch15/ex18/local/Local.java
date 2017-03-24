package ch15.ex18.local;

import lib.utils.Generators;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nAnonimm Class w Generic Check\n");
        Random rnd = new Random();
        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line, Customer.generator(), 10);  // заполнить коллекцию классом
        List<Teller> list = new ArrayList<>();
        Generators.fill(list, Teller.generator(), 5);
        for (Customer c : line) {
            Teller t = list.get(rnd.nextInt(list.size()));
            serve(t, c);
        }


    }
}
