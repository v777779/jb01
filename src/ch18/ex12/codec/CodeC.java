package ch18.ex12.codec;

import lib.files.BFileRead;

import java.io.File;

/**
 * Created by V1 on 20-Feb-17.
 */
public class CodeC {
    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\nFileWriter Check\n");
        String fileName = "./src/ch18/ex12/codec/CodeC.java";
        String fileName2 = "./src/ch18/ex12/codec/P.txt";
        String fileName3 = "./src/ch18/ex12/codec/P_fm.txt";

        new File(fileName2).delete();
        new File(fileName3).delete();
        BasicOutput.check(fileName,fileName2, fileName3);
        System.out.println("\nWritten files:");
        System.out.println("-----------------------------------");
        System.out.println(BFileRead.readString(fileName2));
        System.out.println("-----------------------------------");
        System.out.println(BFileRead.readString(fileName3));



    }
}
