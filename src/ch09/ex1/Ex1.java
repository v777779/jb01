package ch09.ex1;

import ch09.ex1.local.*;
import ch09.ex1.rodent.FieldMouse;
import ch09.ex1.rodent.GenClass;
import ch09.ex1.rodent.Rodent;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Ex1 {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[]{
                new Wind(),
                new Percussion(),
                new Stringed()
        };  // работает
//        Instrument instrument = new Instrument();  не работает
        Music.tuneAll(instruments);

        System.out.println("\n Exercise 1 Abstract Class Check\n");
        FieldMouse fieldMouse = new FieldMouse();                   // одна fieldMouse и та же в массиве
        Rodent[] rodents = GenClass.getRodentArray(fieldMouse);     // массив можно создать это не объекты
        System.out.println("\n Show Array \n");
        for (Rodent rodent : rodents) {
            System.out.println(rodent);
        }
    }
}
