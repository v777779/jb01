package ch20.ex04.exercise;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 25-Apr-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 04 @Unit Test Check\n");
        AtUnitExec.check("out\\production\\jb01\\ch20\\ex04\\exercise\\HashSetTest");

        System.out.println("All test OK, but in initialization() element \"two\" was added to testObject");
        System.out.println("So test _remove() should fail, but it's ok, so the new testObject used");

    }
}
