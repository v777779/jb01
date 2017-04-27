package ch21.ex02.exercise;

import lib.utils.Fibonacci;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 02 Thread with Fibonacci Check\n");
        System.out.println("Fibonacci Row Demo:");
        Fibonacci fb = new Fibonacci();
        for (int i = 0; i < 10 ; i++) {
            System.out.print(fb.next()+" ");
        }

        System.out.println("\nFibonacci 10 Threads:");
        FbRunThreads.check();

    }
}
