package ch11.ex30.integra;

import lib.utils.Show;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nCustom Iterator Check\n");
        PetSeq pets = new PetSeq();
        Show.showPet(pets.iterator()); // реализует интерфейс Iterator


    }
}
