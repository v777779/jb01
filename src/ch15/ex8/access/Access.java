package ch.ex8.access;

import ch.ex8.access.actors.StoryCh;
import ch.ex8.access.actors.StoryChGen;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 8 Generics Check\n");
        for (StoryCh storyCh : new StoryChGen(25)) {
            System.out.println(storyCh);
        }

    }
}
