package ch19.ex10.exercise;


import ch19.ex10.exercise.vm.VendingMachine;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 10 EnumMap and Methods Check\n");

        System.out.println("\nStart Vending Machine based on EnumMap:");
        String fileName = "./src/ch19/ex10/exercise/InputData.txt";
        VendingMachine.check(fileName);

    }
}
