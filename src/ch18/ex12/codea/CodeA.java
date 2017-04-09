package ch18.ex12.codea;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by V1 on 18-Feb-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nMemory Read StringReader Check\n");

        System.out.println("StringReader from String:");
        String s = "System.out.println(\"Memory Read StringReader Check\")";
        StringReader sIn = new StringReader(s);
        int code;
        try {
            while ((code = sIn.read()) != -1) {
                System.out.print((char)code+" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nStringReader from File:");
        MemoryInput.check("./src/ch18/ex12/codea/MemoryInput.java");


    }
}
