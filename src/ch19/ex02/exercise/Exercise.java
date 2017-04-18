package ch19.ex02.exercise;



/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 2 Enum Interface Check\n");
        System.out.println("Static method next() conflicts with IGenerator:");
        EnumImplementation.check();
    }
}
