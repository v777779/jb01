package ch.ex12.access;

import lib.pets.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static Map<Person,List<Pet>> f(Map<Person,List<Pet>> m) {
        return m;
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12 Generic Method Check\n");
        Map<Person,List<Pet>> fmap = f(New.map());  // все работает
        fmap.put(new Person("Katty"),new ArrayList<>(Arrays.asList(new Pug(), new Mutt())));
        fmap.put(new Person("Jimmy"),new ArrayList<>(Arrays.asList(new Mouse(), new Hamster())));
        fmap.put(new Person("Teddy"),new ArrayList<>(Arrays.asList(new Cymr())));
        System.out.println(fmap);


    }
}
