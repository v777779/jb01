package ch18.ex09.access;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 06-Apr-17.
 */
public class BFileReadUp {
    public static List<String> readList(String fileName)  {
        List<String> list = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName)); // инициализируем декоратор файлом
            String s;
            while ((s = in.readLine()) != null) {   // читаем строку из файла в s
                list.add(s.toUpperCase());          // readline() отбрасывает "\n"
            }
            in.close();// закрываем поток
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list; // все что прочитано возвращаем

    }

}

