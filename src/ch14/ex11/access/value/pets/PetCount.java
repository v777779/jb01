package ch14.ex11.access.value.pets;

import java.util.HashMap;
import java.util.List;

/**
 * Created by V1 on 09-Mar-17.
 */
public class PetCount extends HashMap<String, Integer> { // полностью работает как HashMap<String,Integer>

    private void count(String type) {
        Integer q = get(type);
        if (q == null) {
            put(type, 1);
        } else {
            put(type, q + 1);
        }
    }

    public void count(Pet pet, List<Class<? extends Pet>> types) {
        for (Class<? extends Pet> typeClass : types) {
            if (pet.getClass() == typeClass) {
                count(pet.getClass().getSimpleName());
            }
        }
    }

    public void countAll(List<Pet> pets, List<Class<? extends Pet>> types) {
        for (Pet pet : pets) {
            for (Class<? extends Pet> typeClass : types) {
                if (pet.getClass() == typeClass) {
                    count(pet.getClass().getSimpleName());
                }
            }
        }
    }

    public void countPet(PetMake pm) {
        for (Pet pet : pm.getArray(20)) {
            count(pet);
        }

    }

    public void count(Pet pet) {
        System.out.print(pet.getClass().getSimpleName() + " ");
        if (pet instanceof Pet) {
            count("Pet");
        }
        if (pet instanceof Dog) {
            count("Dog");
        }
        if (pet instanceof Cat) {
            count("Cat");
        }
        if (pet instanceof Rodent) {
            count("Rodent");
        }
        if (pet instanceof Pug) {
            count("Pug");
        }
        if (pet instanceof Mutt) {
            count("Mutt");
        }
        if (pet instanceof EgCat) {
            count("EgCat");
        }
        if (pet instanceof Manx) {
            count("Manx");
        }
        if (pet instanceof Cymr) {
            count("Cymr");
        }
        if (pet instanceof Rat) {
            count("Rat");
        }
        if (pet instanceof Mouse) {
            count("Mouse");
        }
        if (pet instanceof Hamster) {
            count("Hamster");
        }
        if (pet instanceof Gerbil) {
            count("Gerbil");
        }

    }


}
