package ch14.ex11.access.unit.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * Created by V1 on 09-Mar-17.
 */
public abstract class PetMake {
    private Random rnd = new Random();

    public abstract List<Class<? extends Pet>> types(); // абстрактный метод выдает свой тип

    public Pet randomPet() {
        int n = rnd.nextInt(types().size()); // выдать индекс по размеру списка
        try {
            return types().get(n).newInstance(); // по сгенерированному списку выдать случайный индекс
        } catch (Exception e) {
            System.out.println("incompatible type:"+types().get(n).getSimpleName());
            throw new RuntimeException(); // переправить в RuntimeException
        }
    }

    public Pet[] getArray(int size) {

        Pet[] pets = new Pet[size];
        for (int i = 0; i < size; i++) {
            pets[i] = randomPet();
        }
        return pets;
    }

    public ArrayList<Pet> getList(int size) {
        ArrayList<Pet> list = new ArrayList<>();
        Collections.addAll(list, getArray(size));

        return list;
    }
}
