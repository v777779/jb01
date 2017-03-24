package ch11.ex30.include;

import lib.utils.Show;
import lib.pets.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nAbstractCollection Class  Check\n");
        PetCollect pets = new PetCollect(); // внутри уже есть объект хранения
        System.out.println(pets);           // видимо показывает как коллекцию

        Show.showCPet(pets);
        Show.showPet(pets.iterator());
        System.out.println("ForEach Iterator:");
        for (Pet pet : pets) {
            System.out.print(pet+" ");
        }
    }
}
