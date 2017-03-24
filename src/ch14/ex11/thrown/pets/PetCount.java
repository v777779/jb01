package ch14.ex11.thrown.pets;

import java.util.HashMap;
import java.util.List;

/**
 * Created by V1 on 09-Mar-17.
 */
public class PetCount  { // полностью работает как HashMap<String,Integer>


    static class PetCounter extends HashMap<String, Integer> {
        private void count(String type) {
            Integer q = get(type);
            if (q == null) {
                put(type, 1);
            } else {
                put(type, q + 1);
            }
        }
    }

    public static void count(Pet pet, List<Class<? extends Pet>> types) {
        PetCounter pc = new PetCounter();
        for (Class<? extends Pet> typeClass : types) {
            if (pet.getClass() == typeClass) {
                pc.count(pet.getClass().getSimpleName());
            }
        }
    }

    public static void countAll(List<Pet> pets, List<Class<? extends Pet>> types) {
        PetCounter pc = new PetCounter();
        for (Pet pet : pets) {
            for (Class<? extends Pet> typeClass : types) {
                if (pet.getClass() == typeClass) {
                    pc.count(pet.getClass().getSimpleName());
                }
            }
        }
    }

    public static void countPet(PetMake pm) {
        for (Pet pet : pm.getArray(20)) {
            count(pet);
        }

    }
    public static void count(Pet pet) {
        PetCounter pc = new PetCounter();
        System.out.print(pet.getClass().getSimpleName()+" ");
        if (pet instanceof Pet) {
            pc.count("Pet");
        }
        if (pet instanceof Dog) {
            pc.count("Dog");
        }
        if (pet instanceof Cat) {
            pc.count("Cat");
        }
        if (pet instanceof Rodent) {
            pc.count("Rodent");
        }
        if (pet instanceof Pug) {
            pc.count("Pug");
        }
        if (pet instanceof Mutt) {
            pc.count("Mutt");
        }
        if (pet instanceof EgCat) {
            pc.count("EgCat");
        }
        if (pet instanceof Manx) {
            pc.count("Manx");
        }
        if (pet instanceof Cymr) {
            pc.count("Cymr");
        }
        if (pet instanceof Rat) {
            pc.count("Rat");
        }
        if (pet instanceof Mouse) {
            pc.count("Mouse");
        }
        if (pet instanceof Hamster) {
            pc.count("Hamster");
        }
    }


}
