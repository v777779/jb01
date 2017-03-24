package ch09.ex07;

import ch09.ex07.rodent.FieldMouse;
import ch09.ex07.rodent.GenClass;
import ch09.ex07.rodent.Rodent;

/**
 * Created by V1 on 12-Feb-17.
 */
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("\nExercise 7 Interface Rodent Check\n");
        Rodent[] rodents = GenClass.getRodent(new FieldMouse());
        GenClass.show(rodents);
        System.out.println("\nInterface dispose Check\n");
        GenClass.dispose(rodents);
    }
}
