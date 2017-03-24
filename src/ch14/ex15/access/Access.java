package ch14.ex15.access;

import ch14.ex15.access.pets.Pet;
import ch14.ex15.access.pets.Pets;
import ch14.ex15.access.pets.TypeCount;

import java.util.List;


/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 15 Check\n");

        System.out.println("ClassInfo:");
        TypeCount tp = new TypeCount(Pet.class); // создать объект счетчика
        List<Pet> plist = Pets.getList(25);
        for (Pet pet : plist) {
            System.out.print(pet.getClass().getSimpleName()+" ");
            tp.count(pet);
        }
        System.out.println();
        System.out.println(tp);


    }
}
