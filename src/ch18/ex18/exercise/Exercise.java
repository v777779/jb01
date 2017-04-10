package ch18.ex18.exercise;

import java.io.IOException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 18 TextFile w Exception Check\n");
        String fileName = "./src/ch18/ex18/Ex18.java";
        try {
            System.out.println(TextFileE.read(fileName));
            System.out.println(new TextFileE(fileName,"\\W+"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
