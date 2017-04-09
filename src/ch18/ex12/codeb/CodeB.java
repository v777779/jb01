package ch18.ex12.codeb;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * Created by V1 on 20-Feb-17.
 */
public class CodeB {
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nMemory Read Formatted DataStreamInput Check\n");

        System.out.println("ByteArrayInputStream from String:");
        String s = "System.out.println(\"Memory Read StringReader Check\")";
        ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes()); // перевести строку в байты
        int code;
        while (in.available() > 0) {  // метод определения конца потока
            code = in.read();
            System.out.print((char) code + " ");
        }

        System.out.println("\nDataStreamInput from String:");
        DataInputStream dIn = new DataInputStream(new ByteArrayInputStream(s.getBytes())); // перевести строку в байты
        try {
            while (in.available() != 0) {
                code = dIn.read();
                System.out.print((char) code + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nDataStreamInput from File:");
        String fileName = "./src/ch18/ex12/codeb/FmtMemInput.java";
        FmtMemInput.check(fileName);
    }
}
