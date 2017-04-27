package ch20.ex11.exercise;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise Check\n");

//        String pathClass = "ch20.ex11.exercise.AtNoteTest";
//        Proc.check(pathClass);

        AtUnitExec.checkM("out/production/jb01/ch20/ex11/exercise/AtNoteTest");
    }
}
