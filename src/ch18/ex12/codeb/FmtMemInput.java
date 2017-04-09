package ch18.ex12.codeb;

import lib.files.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by V1 on 08-Apr-17.
 */
public class FmtMemInput {
    public static void check(String fileName) {
        System.out.println("---------------------------");
        try {
            String fileString;
            fileString= new BufferedInputFile().read(fileName); // весь файл в одну строку
            DataInputStream in = new DataInputStream( new ByteArrayInputStream(fileString.getBytes()));
           int code;

            byte[] bb = new byte[10];
            System.out.println(Arrays.toString(bb));
            in.readFully(bb);
            System.out.println(Arrays.toString(bb));

            while (in.available() > 0){ // число доступных байт
                    code = in.read();
                System.out.print((char)code+".");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n---------------------------");
    }
}
