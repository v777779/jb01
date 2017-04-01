package lib.pets;

import lib.utils.IFactory;

import java.util.*;


/**
 * Created by V1 on 09-Mar-17.
 */
public class PetMakeL {
    private Random rnd = new Random();

    private static List<IFactory<? extends Pet>> pList = new ArrayList<>(); //

    static {
        pList.add(new Pug.Factory());
        pList.add(new Mutt.Factory());
        pList.add(new EgCat.Factory());
        pList.add(new Manx.Factory());
        pList.add(new Cymr.Factory());
        pList.add(new Mouse.Factory());
        pList.add(new Rat.Factory());
        pList.add(new Hamster.Factory());
    }

    public Pet randomPet() {
        int n = rnd.nextInt(pList.size()); // выдать индекс по размеру списка
        return pList.get(n).create();
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

    public List<Pet> getList() {
        List<Pet> list = new ArrayList<>();
        list.add(new Rat("Fuzzy"));
        list.add(new Rat("Fizzy"));
        list.add(new Rat("Freckly"));
        list.add(new Cat("Stanford aka Stinky el Negro"));
        list.add(new Cat("Pinkola"));
        list.add(new Cat("Shackleton"));
        list.add(new Cat("Elsie May"));
        list.add(new Cymr("Molly"));
        list.add(new Pug("Louie aka Louis Snorkelstein Dupree"));
        return list;
    }
}
