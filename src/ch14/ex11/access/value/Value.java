package ch14.ex11.access.value;

import ch14.ex11.access.value.pets.Pet;
import ch14.ex11.access.value.pets.PetCount;
import ch14.ex11.access.value.pets.Pets;
import ch14.ex11.access.value.pets.TypeCount;

import java.util.List;
import java.util.Map;


/**
 * Created by V1 on 20-Feb-17.
 */
public class Value {
    public static void app() throws Exception {
        System.out.println("\n====ACCESS_VALUE===");
        System.out.println("\nClass isAssignableFrom() Check\n");

        System.out.println("PetCount:");
        PetCount pc = new PetCount();
        List<Pet> pList = Pets.getList(25);
        for (Pet pet : pList) {
            pc.count(pet);
        }
        System.out.println();
        System.out.print("[");
        for (Map.Entry<String, Integer> entry : pc.entrySet()) {
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
        System.out.println("]");
        System.out.println();


        System.out.println("ClassInfo:");
        TypeCount tp = new TypeCount(Pet.class); // создать объект счетчика
        for (Pet pet : pList) {
            System.out.print(pet.getClass().getSimpleName()+" ");
            tp.count(pet);
        }
        System.out.println();
        System.out.println(tp);




    }
}
