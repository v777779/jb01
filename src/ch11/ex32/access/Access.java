package ch11.ex32.access;

import lib.pets.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 32 Check\n");
        PetIterable pets = new PetIterable(); // получили массив и класс Iterable
//Standard
        System.out.print("Pets Default  Iterator: ");
        for (Pet pet : pets) {
            System.out.printf("%s ",pet);
        }
        System.out.println();
//Reversed
        System.out.print("Pets Reversed Iterator: ");
        for (Pet pet : pets.rev()) {
            System.out.printf("%s ",pet);
        }
        System.out.println();
//Shaffle
        System.out.print("Pets Shuffled Iterator: ");
        for (Pet pet : pets.shfl()) {
            System.out.printf("%s ",pet);
        }
        System.out.println();

    }
}
