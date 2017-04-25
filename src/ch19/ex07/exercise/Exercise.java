package ch19.ex07.exercise;

import java.util.EnumSet;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 7 EnumSet Check\n");

        EnumSet<LocalPoint> enumLocal = EnumSet.allOf(LocalPoint.class);
        System.out.println(enumLocal);

        System.out.println("EnumSet working via two classes:");
        System.out.println("RegularEnumSet 64 bit parameter: long   elements");
        System.out.println("JumboEnumSet  >64 bit parameter: long[] elements");

    }
}
