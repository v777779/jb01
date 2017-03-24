package ch14.ex11.value.pets;

import java.util.List;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Pets {
    public static final PetMake pets = new PetNameL(); // заряжаем потомка в тело предка

    public static Pet randomPet() {
        return pets.randomPet();
    }

    public static Pet[] getArray(int size) {
        return pets.getArray(size);
    }

    public static List<Pet> getList(int size) {
        return pets.getList(size);
    }
}
