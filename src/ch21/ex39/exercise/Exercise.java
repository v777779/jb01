package ch21.ex39.exercise;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 12-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 39 Lock vs Atomic Performance Check\n");
        final int nRecords = 100000;  // на больших числах Atomic в 2 раза быстрее
        FastSimulation.check(nRecords);
        LongSimulation.check(nRecords);
    }
}
