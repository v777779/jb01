package ch11.ex08.local;

import lib.pets.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nIterator  Check\n");

        List<Pet> pets = Pets.arrayList(12); // не использовать new!!!
        Iterator<Pet> it = pets.iterator(); // получили итератор обязательно <Pet>
        System.out.print("Iterator manual  > ");
        while (it.hasNext()) {
            Pet p = it.next();  // обязательно <Pet> в итератор чтобы здесь сработало
            System.out.print(p.getId()+":"+p+" ");
        }
        System.out.print("\nIterator foreach > ");
        for (Pet pet : pets) {   // тоже самое с итератором, но неявно
            System.out.print(pet.getId()+":"+pet+" ");
        }
        it = pets.iterator(); // пересоздать итератор это нормально, они одноразовые
        for (int i = 0; i < 6 ; i++) {
            it.next(); // получить объект
            it.remove(); // удалить
        }
        System.out.print("\nIterator removal > ");
        for (Pet pet : pets) {   // тоже самое с итератором, но неявно
            System.out.print(pet.getId()+":"+pet+" ");
        }
        System.out.println();


    }
}
