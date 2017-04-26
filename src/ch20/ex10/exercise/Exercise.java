package ch20.ex10.exercise;

import ch20.ex10.exercise.access.Access;
import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 26-Apr-17.
 */
public class Exercise {

    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 10 @Unit User Class Check\n");
        System.out.println("User Class Demo:");
        new Access("ch20.ex10.exercise.access.FancyToy").app();
        System.out.println("@Unit Test of User Class:");
        AtUnitExec.check("out/production/jb01/ch20/ex10/exercise/AccessTest");
    }
}
