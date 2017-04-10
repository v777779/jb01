package ch18.ex21.exercise;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 21 System In Check\n");

        //SystemInData.check(System.in,System.out);
        String fileName = "./src/ch18/ex21/exercise/Exercise.java";
        try {
            SystemInData.check(new FileInputStream(fileName), System.out);
            System.out.println("Stop Echoing");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
