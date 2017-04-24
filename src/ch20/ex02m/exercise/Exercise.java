package ch20.ex02m.exercise;

import ch20.ex02m.exercise.annotate.Divide;
import ch20.ex02m.exercise.annotate.Mult;
import lib.system.OSExecute;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 24-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 02m Check\n");
        OSExecute.command("cmd /c cd src\\ch20\\ex02m\\exercise & j6.cmd");

        System.out.println(new Mult().multiply(4,3));
        System.out.println(new Divide().divide(7,2));

    }
}
