package lib.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by V1 on 10-Apr-17.
 */
public class BinaryFile {
    public static byte[] read(File file) {
        file = file.getAbsoluteFile();
        try {
            FileInputStream fr = new FileInputStream(file);
            BufferedInputStream br = new BufferedInputStream(fr);
            try {
                byte[] bytes = new byte[br.available()];    // зарезервировать буфер байт
                br.read(bytes);                             // прочитать в размер буфера
                return bytes;                               // выходим успешно либо по Exception
            } finally {                                     // внутренний цикл try_finally
                br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] read(String fileName) {
        File file = new File(fileName).getAbsoluteFile();
        try {
            FileInputStream fr = new FileInputStream(file);
            BufferedInputStream br = new BufferedInputStream(fr);
            try {
                byte[] bytes = new byte[br.available()];    // зарезервировать буфер байт
                br.read(bytes);                             // прочитать в размер буфера
                return bytes;                               // выходим успешно либо по Exception
            } finally {                                     // внутренний цикл try_finally
                br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append("[");
        for (byte aByte : bytes) {
            sb.append(String.format("%3d, ",aByte));
            if (count++ % 10 == 0) {
                sb.append("\n ");
            }
        }
        if (sb.charAt(sb.length() - 2) == '\n') {
            sb.delete(sb.length()-2,sb.length());
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append("]\n");
        return sb.toString();
    }
}
