package ch20.ex11.exercise;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 26-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise Check\n");

        System.out.println("Recursive Search @TestNote for Class, Methods, Fields:");
        String pathClass = "ch20.ex11.exercise.AtNoteTest";
        Proc.check(pathClass);

        System.out.println("\nMethods with @TestNote Only:");
        AtUnitExec.checkM("out/production/jb01/ch20/ex11/exercise/AtNoteTest");
    }
}
