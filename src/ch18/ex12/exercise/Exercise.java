package ch18.ex12.exercise;

import lib.files.BFileRead;
import lib.files.BFileWrite;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app(String[] args) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12 File Write Check\n");

        if (args == null || args.length == 0) {
            System.out.println("Usage: args[0] <filePath>");
        }
        if (args.length < 2) {
            args = new String[]{
                    "./src/ch18/ex12/exercise/Exercise.java",
                    "./src/ch18/ex12/exercise/Exercise.txt"
            };
        }
        System.out.println("\nExercise 8 LinkedList Backward Reading File:");
        System.out.println("--------------------------------------------:");
        List<String> list = new LinkedList<>(BFileRead.readList(args[0]));
        for (ListIterator<String> lit = list.listIterator(list.size()); lit.hasPrevious(); ) {
            System.out.println(lit.previous());
        }


        System.out.println("\nExercise 12 LinkedList Backward Writing File:");
        System.out.println("--------------------------------------------:");

        new File(args[1]).delete(); // стираем если есть
        BFileWrite.writeList(list, args[1]);
        System.out.println(BFileRead.readString(args[1])); // прочитать записанный файл


    }
}
