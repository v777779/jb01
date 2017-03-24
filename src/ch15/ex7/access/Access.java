package ch.ex7.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 7 Composition Iterable Check\n");

        for (Integer integer : new CompFibonacci(25)) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }
}
