package ch07.ex12a;

import ch07.ex12a.access.Plate;
import ch07.ex12a.local.Bart;
import ch07.ex12a.local.Hide;
import ch07.ex12a.local.MilHouse;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Ex12a {
    public static void main(String[] args) {
        Bart bart = new Bart();
        Hide hide = new Hide();

        System.out.println("\nBart's Overloaded Methods Check \n");
        System.out.print("Bart's native Method   > ");
        bart.doh(new MilHouse());
        System.out.print("Bart's extends Methods > ");
        bart.doh('c');  // char
        bart.doh(2.71f); // float

        System.out.println("\nHide's Overloaded Methods Check \n");
        System.out.print("Hide's native Method   > ");
        hide.doh(3);
        System.out.print("Hide's extends Methods > ");
        hide.doh(new MilHouse());
        hide.doh('D');  // char
        hide.doh(7.84f); // float

        System.out.println("\nExercise Overloaded Methods Check \n");
        Plate plate = new Plate();
        plate.calc(1L);
        plate.calc(1235.44);
        plate.calc(756);
        plate.calc(564.32F);
        plate.calc("Test");








    }
}
