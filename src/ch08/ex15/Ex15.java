package ch08.ex15;

import ch08.ex15.local.FieldMouse;
import ch08.ex15.local.GenClass;
import ch08.ex15.local.Rodent;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Ex15 {
    public static void main(String[] args) {
        System.out.println("\nRodent[] FieldMouse Reference Check\n");
        FieldMouse fieldMouse = new FieldMouse();


        System.out.println("\nRodent[] started\n");
        Rodent[] rodents = GenClass.getRodent(fieldMouse);
        System.out.println("\nRodent[] created\n");
        GenClass.show(rodents);
        System.out.println("\nRodent[] dispose\n");
        GenClass.dispose(rodents);

    }
}
