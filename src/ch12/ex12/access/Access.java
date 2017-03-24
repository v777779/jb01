package ch12.ex12.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12 Exception Check\n");


        Sequence sq = null; // на 20 элементов Integer
        try {
            sq = new Sequence(32);
        } catch (MaxSizeEx maxSizeEx) {
            System.out.println("catch12.exception:<"+maxSizeEx.getClass().getSimpleName()+">");
            return;
        }

        System.out.println("Sequence with Iterator");
        for (Integer anInt : sq) {
            System.out.print(anInt+" " );
        }

    }
}
