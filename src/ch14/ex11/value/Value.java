package ch14.ex11.value;

import ch14.ex11.value.pets.Pet;
import ch14.ex11.value.pets.PetCount2;
import ch14.ex11.value.pets.Pets;
import ch14.ex11.value.pets.TypeCount;

import java.util.List;


/**
 * Created by V1 on 20-Feb-17.
 */
public class Value {
            public static void app() throws Exception {
                System.out.println("\n====VALUE===");
                System.out.println("\nClass isAssignableFrom() Check\n");

                List<Pet> pList = Pets.getList(25);
                System.out.println("PetCount2:");
                PetCount2 pc2 = new PetCount2();
                pc2.countPet( pList);      // HashMap <String, Integer>
                System.out.println(pc2);

                System.out.println("ClassInfo:");
                TypeCount tp = new TypeCount(Pet.class); // создать объект счетчика
                for (Pet pet : pList) {
                    tp.count(pet);
                }
                System.out.println(tp);

    }
}
