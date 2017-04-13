package ch18.ex26.exercise;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 26 Grep with FileChannel Check\n");
        System.out.println("Grep search engine:");
        String regex = "\\bfile\\w+"; // вывести все слова с file*

        String fileName = "./src/ch18/ex26/exercise/";
        JGrepFC jp = new JGrepFC(fileName,regex);
        jp.find();
    }
}
