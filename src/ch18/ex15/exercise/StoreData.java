package ch18.ex15.exercise;

import lib.utils.Range;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 10-Apr-17.
 */
public class StoreData {
    public static void check(String fileWrite) {
        new File(fileWrite).delete(); // удаляем файл если есть
        try {
            FileOutputStream fw = new FileOutputStream(fileWrite);
            DataOutputStream dw = new DataOutputStream(new BufferedOutputStream(fw));
            byte[] bytes = new byte[10];
            int i = 0;
            List<Integer> list = Range.arrayList(bytes.length);
            for (Integer integer : list) {
                bytes[i++] = integer.byteValue();

            }
            dw.write(bytes);  // bytes[]
            int cInt = 125;
            dw.write(cInt); // int
            dw.writeBoolean(true);
            dw.writeByte(-1);
            dw.writeByte(-5);
            dw.writeChar(cInt++);
            dw.writeShort(-1);
            dw.writeShort(-5);
            dw.writeInt(cInt++);
            dw.writeLong(cInt++);
            dw.writeFloat(cInt+1.236F);
            dw.writeDouble(cInt+2.718);
            dw.writeBytes("This is string of bytes");
            dw.writeChars("This is string of chars");
            dw.writeUTF("This is string of UTF");
            dw.close();

            FileInputStream fr = new FileInputStream(fileWrite); // читаем с записанного файла
            DataInputStream dr = new DataInputStream(new BufferedInputStream(fr)); // буферизованный ввод
            System.out.println("\nRead file " + fileWrite + ":");
            bytes = new byte[10]; // пустой массив
            dr.read(bytes);  // bytes[]
            System.out.println("byte[]:"+ Arrays.toString(bytes));
            System.out.println("int   :"+ dr.read());
            System.out.println("bool  :"+ dr.readBoolean());
            System.out.println("byte  :"+ dr.readByte());
            System.out.println("ubyte :"+ dr.readUnsignedByte());
            System.out.println("char  :"+ dr.readChar());
            System.out.println("short :"+ dr.readShort());
            System.out.println("ushort:"+ dr.readUnsignedShort());
            System.out.println("int   :"+ dr.readInt());
            System.out.println("long  :"+ dr.readLong());
            System.out.println("float :"+ dr.readFloat());
            System.out.println("double:"+ dr.readDouble());
            int length =  "This is string of bytes".length();
            bytes = new byte[length];
            dr.read(bytes,0,length);
            System.out.println("Byte[]:"+ Arrays.toString(bytes));
            System.out.print("Byte[]:");
            for (byte b : bytes) {
                System.out.print((char)b);
            }
            System.out.println();
            length  = "This is string of chars".length();
            System.out.print("Char[]:");
            for (int j = 0; j < length; j++) {
                System.out.print(dr.readChar()); // только так
            }
            System.out.println();

            System.out.println("UTF8  :"+dr.readUTF());
            dr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
