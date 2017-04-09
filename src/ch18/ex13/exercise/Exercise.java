package ch18.ex13.exercise;

import lib.files.BFileRead;

import java.io.File;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 13 LineNumber Class Check\n");

        String fileName = "./src/ch18/ex12/codec/CodeC.java";
        String fileName2 = "./src/ch18/ex12/codec/P.txt";

        new File(fileName2).delete();
        BasicOutputModified.check(fileName,fileName2);
        System.out.println("\nWritten files:");
        System.out.println("-----------------------------------");
        System.out.println(BFileRead.readString(fileName2)); // output

    }
}
