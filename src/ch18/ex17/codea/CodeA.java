package ch18.ex17.codea;

import lib.utils.TextFile;
import java.util.TreeSet;

/**
 * Created by V1 on 18-Feb-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nTextFile Check\n");

        String fileRead = "./src/ch18/ex17/codea/CodeA.java";
        String fileWrite = "./src/ch18/ex17/codea/CodeA.txt";

        String fileText = TextFile.read(fileRead);  // прочитали в строку
        TextFile.write(fileWrite,fileText);          // записать текст в другой файл
        TreeSet<String> tSet = new TreeSet<>(new TextFile(fileRead,"\\W+"));
        System.out.println(tSet.headSet("a"));  // до элемента a, то есть все цифры и заглавные буквы
    }
}
