package ch.ex41.access;

import lib.coffee.Coffee;
import lib.coffee.CoffeeGen;
import lib.pets.Pet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 41 Latent and Collection Check\n");

        System.out.println("Coffee IGenerator<Coffee>:");
        List<Coffee> coffees = new ArrayList<>();
        Fill2.fill(Adapter.getAutoAdapterC(coffees),new CoffeeGen(),10);  // походу используется генератор
        System.out.println("coffes:"+coffees);

        System.out.println("Pets IGenerator<Pet>:");
        List<Pet> pets = new ArrayList<>();
        Fill2.fill(Adapter.getAutoAdapterC(pets),new GeneratorP(),10);  // походу используется генератор
        System.out.println("pets:"+pets);


    }
}
