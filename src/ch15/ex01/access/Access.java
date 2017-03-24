package ch15.ex01.access;

import lib.pets.Pet;
import lib.pets.Pets;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 1 Generic Check\n");
        Holder3<Pet>[] h3Array = new Holder3[10];
        for (int i = 0; i <h3Array.length ; i++) {
            h3Array[i]= new Holder3<>(Pets.randomPet());
        }

        for (Holder3<Pet> petHolder3 : h3Array) {
            System.out.println(petHolder3.getA());
        }


    }
}
