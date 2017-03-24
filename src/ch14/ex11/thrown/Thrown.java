package ch14.ex11.thrown;

import ch14.ex11.thrown.pets.PetCount;
import ch14.ex11.thrown.pets.PetNameL;
import ch14.ex11.thrown.pets.Pets;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Thrown {
    public static void app() throws Exception {
        System.out.println("\n====THROWN===");
        System.out.println("\nClass Check\n");


        PetCount.countPet( Pets.pets);      // HashMap <String, Integer>
        System.out.println();
        PetCount.countPet(new PetNameL());  // HashMap <String, Integer>
        System.out.println();


    }
}
