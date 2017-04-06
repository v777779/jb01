package ch18.ex05.access;

import lib.files.IStrategy;
import lib.files.ProcessFiles;

import java.io.File;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 5 File Processing Check\n");

        System.out.println("\nShort version:");
        new ProcessFiles(new IStrategy() {   // анонимный внутренний класс обработчика файлов
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        },"x.*").start(new String[]{"."});    // внутри же метода массив каталогов

    }
}
