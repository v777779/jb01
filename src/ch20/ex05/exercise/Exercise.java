package ch20.ex05.exercise;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 05 @Unit Test with Inheritance Check\n");

        AtUnitExec.check("out\\production\\jb01\\ch20\\ex05\\exercise\\HashSetTest");

    }
}
