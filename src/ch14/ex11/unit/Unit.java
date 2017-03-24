package ch14.ex11.unit;

import ch14.ex11.unit.pets.*;

import java.util.Map;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Unit {
    public static void app() throws Exception {
        System.out.println("\n====UNIT===");
        System.out.println("\nClass Check\n");

        System.out.println("PetCount:");
        PetCount pc = new PetCount();
        pc.countPet(Pets.pets);
        System.out.println();
        System.out.print("[");
        for (Map.Entry<String, Integer> entry : pc.entrySet()) {
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
        System.out.println("]");

        System.out.println("PetCount2:");
        PetCount2 pc2 = new PetCount2();
        pc2.countPet( Pets.pets);      // HashMap <String, Integer>
        System.out.println(pc2);



    }
}
