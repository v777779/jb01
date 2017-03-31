package ch17.ex18.access;

import lib.sets.Sets;
import lib.sets.SlowSet;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 18 AbstractSet Check\n");
        Sets.checkInt(new SlowSet<>());
        Sets.checkStr(new SlowSet<>());

    }
}
