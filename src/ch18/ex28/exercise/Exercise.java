package ch18.ex28.exercise;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 28 Externalizable Check\n");
        Blips.check();
        System.out.println("It's working because default constructor persist's if commented");
    }
}
