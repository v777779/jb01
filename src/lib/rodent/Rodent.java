package lib.rodent;

import java.util.Random;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Rodent {
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

    public Rodent() {
//        System.out.println("\nRodent.Constructor");
    }

    public Rodent(FieldMouse fieldMouse) {
//        System.out.println("\nRodent.Constructor");
    }

    @Override
    public String toString() {
        return "Rodent{}";
    }

    protected void dispose() {
        System.out.println("Rodent.dispose");
    }

    //Static methods
    private static Random rnd = new Random();

    public static Rodent next(FieldMouse fieldMouse) {
        switch (rnd.nextInt(6)) {
            case 0:
                return fieldMouse;
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

    public static Rodent[] getRodent(FieldMouse fieldMouse) {
        Rodent[] rodents = new Rodent[10];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = next(fieldMouse);
            rodents[i].addRef();
        }
        return rodents;
    }

    public static Rodent[] getRodent(int size) {
        Rodent[] rodents = new Rodent[size];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = next();
            rodents[i].addRef();
        }
        return rodents;
    }


    public static void addRef(Rodent rodent) {
        rodent.addRef();
    }


    public static void dispose(Rodent[] rodents) {
        for (Rodent rodent : rodents) {
            rodent.dispose();
        }
    }
    public static void show(Rodent[] rodents) {
        for (Rodent r : rodents) {
            System.out.println(r);
        }
    }



}
