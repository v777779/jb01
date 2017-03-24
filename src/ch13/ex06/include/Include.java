package ch13.ex06.include;

import lib.utils.BinaryFile;

import java.io.IOException;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nString Format Check\n");

        try {
           String s = Hex.format(BinaryFile.read("src/ch13.ex06/local/DbEx.java"));
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("catch: File Error");
        }
    }
}
