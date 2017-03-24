package ch.ex3.local.tuples;

import lib.coffee.Coffee;
import lib.coffee.CoffeeGen;
import lib.figures.Shape;
import lib.pets.Pet;
import lib.pets.Pets;

/**
 * Created by V1 on 14-Mar-17.
 */
public class Tuples {
    public static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("Hi", 15);
    }
    public static ThreeTuple<Pet,String, Integer> g() {
        return new ThreeTuple<>(Pets.randomPet(),"Hi", 15);
    }

    public static FourTuple<Coffee, Pet,String, Integer> h() {
        return new FourTuple<>(CoffeeGen.randomCoffee(),Pets.randomPet(),"Hi", 15);
    }

    public static FiveTuple<Shape, Coffee, Pet, String, Double> k() {
        return new FiveTuple<>(Shape.randomShape(),CoffeeGen.randomCoffee(),Pets.randomPet(),"Hi", 12.1);
    }

}
