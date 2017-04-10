package ch18.ex19.codea;

import lib.utils.BinaryFile;
import java.io.File;

/**
 * Created by V1 on 18-Feb-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nBufferedInputStream Check\n");

        String fileName = "./src/ch18/ex19/codea/CodeA.java";
        System.out.println(BinaryFile.toString(BinaryFile.read(new File(fileName))));

        System.out.println(BinaryFile.toString(BinaryFile.read(fileName)));

    }
}
