package ch11.ex17.include;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nMap Pet <> String Analyze  Check\n");
        Map<String,Pet> petMap = new HashMap<>();
        petMap.put("MyCat",new Cat("Molly"));
        petMap.put("MyDog",new Dog("Ginger"));
        petMap.put("MyHamster",new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("MyDog");  // получить значение по ключу MyDog
        System.out.println(dog);
        System.out.println("petMap: containsKey():"+petMap.containsKey("MyDog"));
        System.out.println("petMap: containsValue():"+petMap.containsValue(dog));


    }
}
