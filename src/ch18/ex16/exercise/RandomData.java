package ch18.ex16.exercise;

import lib.utils.Range;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 10-Apr-17.
 */
public class RandomData {
    private static String fileWrite = "./src/ch18/ex16/exercise/RandomData.txt";

    public static void check() {
        new File(fileWrite).delete(); // удаляем файл если есть
        try {
            RandomAccessFile rf = new RandomAccessFile(fileWrite, "rw");
            byte[] bytes = new byte[10];
            int i = 0;
            List<Integer> list = Range.arrayList(bytes.length);
            for (Integer integer : list) {
                bytes[i++] = integer.byteValue();

            }
            System.out.println("bytes[]:"+Arrays.toString(bytes));
            rf.write(bytes);  // bytes[]
            int cInt = 125;
            rf.write(cInt); // int
            long posT = rf.getFilePointer();//11
            rf.writeBoolean(true);
            rf.writeByte(-1);
            rf.writeByte(-5);
            rf.writeChar(cInt++);
            rf.writeShort(-1);
            rf.writeShort(-5);
            rf.writeInt(cInt++);
            rf.writeLong(cInt++);
            rf.writeFloat(1.236F);//32
            rf.writeDouble(2.718);//36
            long posB = rf.getFilePointer();

            rf.writeBytes("This is string of bytes");//44
            long posC = rf.getFilePointer();
            rf.writeChars("This is string of chars");//67
            long posU = rf.getFilePointer();
            rf.writeUTF("This is string of UTF");//113
            rf.close();

            rf = new RandomAccessFile(fileWrite, "r"); // читаем с записанного файла
            System.out.println("\nRead file " + fileWrite + ":");

            rf.seek(posT);
            System.out.println("bool  :" + rf.readBoolean());

            rf.seek(posB - 12);  //float 4 double 8
            System.out.println("float :" + rf.readFloat());
            System.out.println("double:" + rf.readDouble());

            rf.seek(0);
            bytes = new byte[10]; // пустой массив
            rf.read(bytes);  // bytes[]  оставшиеся 5 байт
            System.out.println("byte[]:" + Arrays.toString(bytes));
            System.out.println("int   :" + rf.read()); // 4 байта
            rf.seek(posT + 1);  // to set on byte
            System.out.println("byte  :" + rf.readByte());
            System.out.println("ubyte :" + rf.readUnsignedByte());
            System.out.println("char  :" + rf.readChar());
            System.out.println("short :" + rf.readShort());
            System.out.println("ushort:" + rf.readUnsignedShort());
            System.out.println("int   :" + rf.readInt());
            System.out.println("long  :" + rf.readLong());

            rf.seek(posU);
            System.out.println("UTF8  :" + rf.readUTF());


            rf.seek(posC);
            int length = "This is string of chars".length();
            System.out.print("Char[]:");
            for (int j = 0; j < length; j++) {
                System.out.print(rf.readChar()); // только так
            }
            System.out.println();

            rf.seek(posB);
            length = "This is string of bytes".length();
            bytes = new byte[length];
            rf.read(bytes, 0, length);
            System.out.println("Byte[]:" + Arrays.toString(bytes));
            System.out.print("Byte[]:");
            for (byte b : bytes) {
                System.out.print((char) b);
            }
            System.out.println();
            rf.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
