package ch15.ex26.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 26 Wildcards Check\n");

        Number[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
             numbers[i] = new Integer(i);
        }
        for (Number number : numbers) {
            System.out.print(number+" "
            );
        }
    }
}
