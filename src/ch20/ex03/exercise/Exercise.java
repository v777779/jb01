package ch20.ex03.exercise;

import lib.system.OSExecute;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 24-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 03 apt Annotation with Visitor Pattern Check\n");
        Message.show();
        OSExecute.command("cmd /c .\\src\\ch20\\ex03\\exercise\\j.cmd");

    }
}
