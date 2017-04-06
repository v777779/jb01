package ch18.ex04.include;

import lib.files.IStrategy;
import lib.files.ProcessFiles;

import java.io.File;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app(String[] args) {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nFile w Strategy Check\n");


        if (args == null || args.length == 0) {
            args = new String[]{"./src/ch18/ex01"};  // пока только один каталог
        }

        System.out.println("Long version:");
        IStrategy stg = new IStrategy() {   // объект интерфейса
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        };

        ProcessFiles pf = new ProcessFiles(stg,"java");
        pf.start(args);

        System.out.println("\nShort version:");
        new ProcessFiles(new IStrategy() {   // анонимный внутренний класс обработчика файлов
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        },"java").start(new String[]{"./src/ch18"});    // внутри же метода массив каталогов


    }
}
