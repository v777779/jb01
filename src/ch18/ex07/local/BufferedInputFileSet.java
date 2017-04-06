package ch18.ex07.local;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 06-Apr-17.
 */
public class BufferedInputFileSet {
    private static List<String> list = new ArrayList<>();
    public static String read(String fileName) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(fileName)); // инициализируем декоратор файлом
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {   // читаем строку из файла в s
            sb.append(s+"\n");                  // readline() отбрасывает "\n"
            list.addAll(Arrays.asList(s.split("[\\W+]")));
        }
        in.close();// закрываем поток
        return sb.toString(); // все что прочитано возвращаем
    }

    public static List<String> getList() {
        return list;
    }

}

