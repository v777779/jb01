package ch14.ex11.recount;

import ch14.ex11.recount.pets.Pet;
import ch14.ex11.recount.pets.PetCount;
import ch14.ex11.recount.pets.PetName;
import ch14.ex11.recount.pets.PetNameL;

import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Recount {
    public static void app() throws Exception {
        System.out.println("\n====RECOUNT===");
        System.out.println("\nClass instanceOf Check\n");

        PetName pn = new PetName();
        PetCount pc = new PetCount(); // HashMap <String, Integer>
        List<Pet> pets = pn.getList(25);
        for (Pet pet : pets) {  // получили список объектов
            System.out.print(pet.getClass().getSimpleName() + " ");
            pc.count(pet);
        }
        System.out.println();

        System.out.println(pc.keySet());
        System.out.print("[");
        for (String s : pc.keySet()) {
            System.out.print(s + ":" + pc.get(s) + " ");
        }
        System.out.println("]");
//modified version
        System.out.println("\nModified version:");
        PetNameL pn2 = new PetNameL();
        PetCount pc2 = new PetCount(); // HashMap <String, Integer>
        List<Pet> pets2 = pn2.getList(25);
        pc2.countAll(pets2,pn2.types());

        System.out.println(pc2.keySet());
        System.out.print("[");
        for (String s : pc2.keySet()) {
            System.out.print(s + ":" + pc2.get(s) + " ");
        }
        System.out.println("]");



    }
}
