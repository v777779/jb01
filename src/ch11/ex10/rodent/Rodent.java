package ch11.ex10.rodent;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Rodent {
    private static Random rnd = new Random();

    public Rodent() {
    }

    public Rodent(FieldMouse fieldMouse) {
    }

    void voice() {
    }

    void eat() {
    }

    void sleep() {
    }

    void run() {
    }

    protected void addRef() {   // если не реализован, то ничего не делает в потомках
    }


    protected void dispose() {
        System.out.println("Rodent.dispose");
    }

    public static Rodent next() {
        switch (rnd.nextInt(6)) {
            case 0:
                return new FieldMouse();
            case 1:
                return new Hamster();
            case 2:
                return new HouseMouse();
            case 3:
                return new Muskrat();
            case 4:
                return new NorwayRat();
            case 5:
                return new Nutria();
            default:
//                return new Instrument();
        }
        return new Rodent();
    }

    public static Rodent randomRodent() {
        return next();
    }

    public static Rodent[] array(int size) {
        Rodent[] rodents = new Rodent[size];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = next();
        }
        return rodents;
    }

    public static ArrayList arrayList(int size) {
        ArrayList<Rodent> rodents = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            rodents.add(next());
        }
        return rodents;
    }


    @Override
    public String toString() {
        return "Rodent{}";
    }

}
