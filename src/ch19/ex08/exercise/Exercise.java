package ch19.ex08.exercise;

import ch19.ex08.exercise.office.PostOffice2;
import ch19.ex08.exercise.post.PostOffice;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 8 Chain Responsibility Pattern Check\n");
        PostOffice.check();
        System.out.println("\nOfficial solution:");
        PostOffice2.check();

    }
}
