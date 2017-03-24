package ch12.ex17.access;

import lib.animal.Frog;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 17 Finally Return Check\n");

        System.out.println("Start Frog Creation ///");
        Frog frog = new Frog();

        try {
            System.out.println("///processing /// ");

        }finally {
            frog.dispose();
        }
        System.out.println("/// Process done  ");


    }
}
