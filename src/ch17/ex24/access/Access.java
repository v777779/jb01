package ch17.ex24.access;

import lib.sets.Sets;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 24 Check\n");
        Sets.checkInt(new SimpleHashSet<>());

        Sets.checkStr(new SimpleHashSet<>());


    }
}
