package ch18.ex12.codea;

import lib.files.BufferedInputFile;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by V1 on 08-Apr-17.
 */
public class MemoryInput {
    public static void check(String fileName) {
        System.out.println("---------------------------");

        try {
            StringReader in = new StringReader(new BufferedInputFile().read(fileName));

            int code;
            while ((code = in.read()) != -1) {
                System.out.print((char)code+".");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n---------------------------");

    }
}
