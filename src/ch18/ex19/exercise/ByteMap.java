package ch18.ex19.exercise;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by V1 on 10-Apr-17.
 */
public class ByteMap {
    public static Map<Byte, Integer> count(byte[] bytes) {
        Map<Byte, Integer> hMap = new HashMap<>();
        try {
            BufferedInputStream in = new BufferedInputStream(new ByteArrayInputStream(bytes));
            try {
                while (in.available() > 0) {
                    Byte bKey = (byte) in.read();
                    Integer value = hMap.get(bKey);
                    if (value == null) {
                        value = 0;
                    }
                    hMap.put(bKey, ++value);
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return hMap;
    }

    public static void showBytes(Map<Byte, Integer> map) {
        int lines = 1;
        for (Byte bValue : map.keySet()) {
            System.out.printf("%-3d=%3d    ", bValue, map.get(bValue));
            if (lines++ % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void showChars(Map<Byte, Integer> map) {
        int lines = 1;
        for (Byte bValue : map.keySet()) {
            if (bValue == 10) {
                System.out.printf("\\n\'%3d=%3d    ", bValue, bValue, map.get(bValue));
            } else if (bValue == 13) {
                System.out.printf("\'\\r\'%3d=%3d    ", bValue, bValue, map.get(bValue));
            } else{
                System.out.printf("\'%c\'%3d=%3d    ", bValue, bValue, map.get(bValue));
            }
            if (lines++ % 10 == 0) {
                System.out.println();
            }

        }
        System.out.println();
    }

}
