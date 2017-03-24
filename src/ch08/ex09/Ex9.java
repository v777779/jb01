package ch08.ex09;

import ch08.ex09.local.GenClass;
import ch08.ex09.local.GenRodent;
import ch08.ex09.local.Rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex9 {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];

        System.out.println("\n Exercise 9 Polymorphism Check\n");
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = GenRodent.next();
        }

        System.out.println("\n Information About Objects\n");
        for (Rodent rodent : rodents) {
            System.out.println(rodent);
        }
        System.out.println("\n Methods of Array of Objects\n");
        for (Rodent rodent : rodents) {
            System.out.println();
            GenClass.voice(rodent);
            GenClass.eat(rodent);
            GenClass.sleep(rodent);
            GenClass.run(rodent);
        }

    }
}
