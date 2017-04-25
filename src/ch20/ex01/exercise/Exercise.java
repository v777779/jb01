package ch20.ex01.exercise;

import ch20.ex01.exercise.dbase.TableCreator;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class Exercise {
    public static void app(String[] args) {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 1 Annotation Check\n");
        TableCreator.check(args);
    }
}
