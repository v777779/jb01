package ch15.ex15.access.tuples;

import lib.coffee.Coffee;
import lib.coffee.CoffeeGen;
import lib.shapes.Shape;
import lib.pets.Pet;
import lib.pets.Pets;

/**
 * Created by V1 on 14-Mar-17.
 */
public class TupleTest{
    public static TwoTuple<String, Integer> f() {
        return Tuple.tuple("Hi", 15);
    }

    public static TwoTuple f2() {       // не параметризованный объект нет типов <String, Integer>
        return Tuple.tuple("Lo", 17);
    }

    public static ThreeTuple<Pet,String, Integer> g() {
        return Tuple.tuple(Pets.randomPet(),"Hi", 15);
    }

    public static FourTuple<Coffee, Pet,String, Integer> h() {
        return Tuple.tuple(CoffeeGen.randomCoffee(),Pets.randomPet(),"Hi", 15);
    }

    public static FiveTuple<Shape, Coffee, Pet, String, Double> k() {
        return Tuple.tuple(Shape.randomShape(),CoffeeGen.randomCoffee(),Pets.randomPet(),"Hi", 12.1);
    }

}
