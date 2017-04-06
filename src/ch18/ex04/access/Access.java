package ch18.ex04.access;

import lib.files.Catalog;

import java.io.File;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 4 Sum of the files length Check\n");

        long length = 0;
        String pathName = "./src/ch18/ex04";
        for (File file : Catalog.walk(new File(pathName).getAbsolutePath(), ".*")) { // итератор только по файлам
            length += file.length(); // просуммировать длину файлов
            System.out.printf("%-25s:%d\n", file.getName(), file.length());
        }
        System.out.println("==============================");
        System.out.println("Total length             :" + length);

    }
}
