package ch18.ex15.codea;

import java.io.*;
import java.util.Arrays;

/**
 * Created by V1 on 10-Apr-17.
 */
public class StoreAndRecoverData {
    public static void check(String fileWrite) {
        new File(fileWrite).delete(); // удаляем файл если есть
        try {
            FileOutputStream fw = new FileOutputStream(fileWrite);
            DataOutputStream dw = new DataOutputStream(new BufferedOutputStream(fw));
            dw.writeDouble(3.14159);
            dw.writeUTF("That was PI");
            dw.writeDouble(1.41413);
            dw.writeUTF("Square Root of 2");
            dw.writeInt(1002);
            dw.writeBoolean(true);
            dw.close();

            FileInputStream f2 = new FileInputStream(fileWrite); // читаем с записанного файла
            byte [] bytes = new byte[10];
            f2.read(bytes);
            System.out.println(Arrays.toString(bytes));
            for (byte aByte : bytes) {
                System.out.printf("%02X, ",(aByte & 0xFF));
            }
            System.out.println();

            FileInputStream fr = new FileInputStream(fileWrite); // читаем с записанного файла
            DataInputStream dr = new DataInputStream(new BufferedInputStream(fr)); // буферизованный ввод
            System.out.println("\nRead file "+fileWrite+":");
            System.out.println(dr.readDouble());
            System.out.println(dr.readUTF()); // прочитать строку
            System.out.println(dr.readDouble());
            System.out.println(dr.readUTF()); // прочитать строку
            System.out.println(dr.readInt());
            System.out.println(dr.readBoolean()); // прочитать строку




        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
