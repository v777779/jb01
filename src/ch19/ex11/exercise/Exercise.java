package ch19.ex11.exercise;

import ch19.ex11.exercise.vm.VendingMachine;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 11 EnumMap and Class Objects from TextFile Check\n");

        System.out.println("\nStart Vending Machine based on EnumMap:");
        String fileName = "./src/ch19/ex10/exercise/InputData.txt";
        VendingMachine.check(fileName);

    }
}
