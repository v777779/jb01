package ch17.ex28.access.tuples;

import lib.coffee.Coffee;
import lib.coffee.CoffeeGen;
import lib.pets.Pet;
import lib.pets.Pets;
import lib.shapes.Shape;

/**
 * Created by V1 on 14-Mar-17.
 */
public class TuplesTest {
    public static Tuples.TwoTuple<String, Integer> f() {
        return Tuples.tuple("Hi", 15);
    }

    public static Tuples.TwoTuple f2() {       // не параметризованный объект нет типов <String, Integer>
        return Tuples.tuple("Lo", 17);
    }

    public static Tuples.ThreeTuple<Pet,String, Integer> g() {
        return Tuples.tuple(Pets.randomPet(),"Hi", 15);
    }

    public static Tuples.FourTuple<Coffee, Pet,String, Integer> h() {
        return Tuples.tuple(CoffeeGen.randomCoffee(), Pets.randomPet(),"Hi", 15);
    }

    public static Tuples.FiveTuple<Shape, Coffee, Pet, String, Double> k() {
        return Tuples.tuple(Shape.randomShape(),CoffeeGen.randomCoffee(), Pets.randomPet(),"Hi", 12.1);
    }

    public static Tuples.SixTuple<Pet, Shape, Coffee, Long, Double, String> m() {
        return Tuples.tuple(Pets.randomPet(), Shape.randomShape(),CoffeeGen.randomCoffee(), 15L, 12.1,"Hi");
    }


}
