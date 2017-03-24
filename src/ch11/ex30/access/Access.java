package ch11.ex30.access;

import lib.utils.Show;
import lib.pets.*;


import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 30 Collection Implement Check\n");

        PetColl pets = new PetColl();
        Show.showCPet(pets);
        Pet[] p2 = pets.toArray();
        System.out.println("P2:"+Arrays.toString(p2));
        Pet[] p4 = Pets.getArray(16);
        System.out.println("P4:"+Arrays.toString(p4));

        Pet[] p6 = pets.toArray(p4);
        System.out.println("P6:"+Arrays.toString(p6));
        Pet[] p8 = pets.toArray(new Pet[0]);
        System.out.println("P8:"+Arrays.toString(p8));

        Iterator<Pet> it = pets.iterator();
        System.out.println("Custom Iterator:");
        while (it.hasNext()) {
            System.out.print(it.next()+" , ");
        }
        System.out.println();

        System.out.println("ForEach Iterator:");
        for (Pet pet : pets) {
            System.out.print(pet+" : ");
        }


    }
}
