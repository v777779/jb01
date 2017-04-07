package ch18.ex10.access;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by V1 on 06-Apr-17.
 */
public class BFileSearch {
    public static String readString(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName)); // инициализируем декоратор файлом
            String s;
            while ((s = in.readLine()) != null) {   // читаем строку из файла в s
                sb.append(s + "\n");                  // readline() отбрасывает "\n"
            }
            in.close();// закрываем поток
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString(); // все что прочитано возвращаем
    }

    public static List<String> readList(String[] args) {
        List<String> list = new ArrayList<>();
        if (args == null || args.length < 1) {
            throw new RuntimeException("File not found");
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader(args[0])); // инициализируем декоратор файлом
            String s;
            for (int i = 0; i < args.length; i++) {
                  args[i] = args[i].toLowerCase(); // один раз в lowerCase
            }
            while ((s = in.readLine()) != null) {   // читаем строку из файла в s
                if (args.length < 2) {              // readline() отбрасывает "\n"
                    list.add(s);
                    continue;
                }
                Set<String> hSet = new HashSet<>(Arrays.asList(s.toLowerCase().split("\\W+")));
                for (int i = 1; i < args.length; i++) {
                    if (hSet.contains(args[i])) {
                        list.add(s);
                        break;
                    }
                }
            }
            in.close();// закрываем поток
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list; // все что прочитано возвращаем

    }

}

