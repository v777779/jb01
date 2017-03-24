package ch11.ex08.include;

import lib.pets.*;
import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void display(Iterator<Pet> it) {  // доступ к любым контейнерам
        while (it.hasNext()) {                      // поддерживающим интерфейс Iterator<Pet>
            Pet p = it.next();
            System.out.print(p.getId()+":"+p+" ");
        }
        System.out.println();
    }


    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nIterator Cross Local Check\n");
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> lpets = new LinkedList<>(pets); // из базового списка связанный
        HashSet<Pet> hpets = new HashSet<>(pets);
        TreeSet<Pet> tpets = new TreeSet<>(pets);

        display(pets.iterator());
        display(lpets.iterator());
        display(hpets.iterator());
        display(tpets.iterator());


    }
}
