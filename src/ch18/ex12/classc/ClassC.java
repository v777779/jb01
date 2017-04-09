package ch18.ex12.classc;

import java.io.File;

/**
 * Created by V1 on 20-Feb-17.
 */
public class ClassC {
    public static void app() {
        System.out.println("\n====CLASS_C===");
        System.out.println("\nFileWriter Check\n");
        String fileName = "./src/ch18/ex12/classc/ClassC.java";
        String fileName2 = "./src/ch18/ex12/classc/P.txt";
        String fileName3 = "./src/ch18/ex12/classc/P_fm.txt";

        new File(fileName2).delete();
        new File(fileName3).delete();
        BasicOutput.check(fileName,fileName2, fileName3);

    }
}
