package lib.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by V1 on 06-Apr-17.
 */
public class BufferedInputFile {
    public static String read(String fileName) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(fileName)); // инициализируем декоратор файлом
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {   // читаем строку из файла в s
            sb.append(s+"\n");                  // readline() отбрасывает "\n"
        }
        in.close();// закрываем поток
        return sb.toString(); // все что прочитано возвращаем
    }

}

