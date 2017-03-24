package ch15.ex04.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 4 Generic Check\n");

        System.out.println("\n Inner Class CheckGarden\n");
        Sequence<String> sequence = new Sequence<>(10); // типизованная последовательность
        for (int i = 0; i < 9; i++) {
            sequence.add(Integer.toString(i));          // упаковка
        }


    }
}
