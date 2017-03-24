package ch08.ex12;

import ch08.ex12.access.Wing;
import ch08.ex12.local.GenRodent;
import ch08.ex12.local.Rodent;
import ch08.ex12.local.GenClass;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Ex12 {
    public static void main(String[] args) {

        System.out.println("\nPolymorfism  Init Check\n");
        Wing wing = new Wing();

        System.out.println("\n Polymorphism Dispose Check\n");
        wing.dispose();

        System.out.println("\n Exercise 12 Polymorphism Dispose Check\n");
        Rodent[] rodents = new Rodent[10];
        System.out.println("\nRodent Class Construction\n");
        for (int i = 0; i < rodents.length; i++) {
             rodents[i] = GenRodent.next();
            System.out.println();
        }

        System.out.println("\nRodent Class disposal\n");
        for (int i = 0; i < rodents.length; i++) {
            GenClass.dispose(rodents[i]);
            System.out.println();

        }

    }
}
