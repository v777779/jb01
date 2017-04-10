package ch18.ex16.codea;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by V1 on 10-Apr-17.
 */
public class RandomAccess {
    private static String fileName = "./src/ch18/ex16/codea/RandomAccess.txt";
    private static void display() {
        System.out.println("\nDisplay from file:");
        try {
            RandomAccessFile rf = new RandomAccessFile(fileName,"r"); // доступ чтение
            for (int i = 0; i < 7 ; i++) {
                System.out.println("Value"+i+":"+rf.readDouble());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void display(long pos, int count) {
        System.out.println("\nDisplay from file w seek:");
        try {
            RandomAccessFile rf = new RandomAccessFile(fileName,"r"); // доступ чтение
            rf.seek(pos);
            for (int i = 0; i < count ; i++) {
                System.out.println("Value"+i+":"+rf.readDouble());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void check() {
        try {
            new File(fileName).delete();
            RandomAccessFile rf = new RandomAccessFile(fileName, "rw");
            for (int i = 0; i < 7; i++) {
                rf.writeDouble(i*1.414);
            }
            rf.writeUTF("The end of the file");
            rf.close();
            display();
            rf = new RandomAccessFile(fileName, "rw");
            rf.seek(5*8);
            rf.writeDouble(47.0001);
            rf.close();
            display();
            display(4*8,3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
