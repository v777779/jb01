package ch.ex3.local;

import ch.ex3.local.tuples.FiveTuple;
import ch.ex3.local.tuples.Tuples;
import ch.ex3.local.tuples.TwoTuple;
import lib.coffee.Coffee;
import lib.coffee.CoffeeGen;
import lib.pets.Pet;
import lib.pets.Pets;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nGeneric Tuple Check\n");
        System.out.println("FiveTuple Class:");
        System.out.println("----------------");
        FiveTuple<Pet,String,Integer,Boolean,Coffee> f5 = new FiveTuple<>(
                Pets.randomPet(),"String_F5",120, true, CoffeeGen.randomCoffee()
        );
        System.out.println(f5);

        System.out.println("Tuple Test:");
        System.out.println("----------------");
        TwoTuple<String, Integer> ttsi = Tuples.f();
        System.out.println(ttsi);
        // ttsi.first = "Hi2";  доступа нет, так как это поле final
           ttsi.second = 21;//  доступа есть
        System.out.println(ttsi);
        System.out.println(Tuples.g());
        System.out.println(Tuples.h());
        System.out.println(Tuples.k());


    }
}
