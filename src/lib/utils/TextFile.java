package lib.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by V1 on 10-Apr-17.
 */
public class TextFile extends ArrayList<String>{
// данные Класса
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder(); // набор строки
        try {
            File file = new File(fileName).getAbsoluteFile();  // все таки это файл по полному абсолютному пути
            BufferedReader in = new BufferedReader(new FileReader(file));  // по файлу открываем буфер чтение
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append('\n');
                }
            } finally {
                in.close(); // закрыть по любому
            }
        } catch (IOException e) {
            throw new RuntimeException(e); // блокируем распространение Exception
        }
        return sb.toString();
    }

    public static void write(String fileName, String text) {
        try {
            File file = new File(fileName).getAbsoluteFile();  // все таки это файл по полному абсолютному пути
            PrintWriter out = new PrintWriter(file); // с файлом по абсолютному пути
            try {
                out.print(text);

            } finally {
                out.close(); // закрыть по любому
            }
        } catch (IOException e) {
            throw new RuntimeException(e); // блокируем распространение Exception
        }
    }

// данные Объекта
// конструкторы
    public TextFile(String fileName, String splitter) {  // конструктор
        super(Arrays.asList(read(fileName).split(splitter)));
        if (get(0).equals("")) {  // заплатка
            remove(0);
        }
    }

    public TextFile(String fileName) {  // конструктор
//        super(Arrays.asList(read(fileName).split('\n'));  вместо этого вызывается предыдущий конструктор
        this(fileName,"\n");  // предыдущий конструктор
    }

// методы
    public void write(String fileName) {  // запись экземпляра  this.ArrayList
        try {
            File file = new File(fileName).getAbsoluteFile();  // все таки это файл по полному абсолютному пути
            PrintWriter out = new PrintWriter(file); // с файлом по абсолютному пути
            try {
                for (String s : this) {  // это же ArrayList
                    out.print(s);
                }

            } finally {
                out.close(); // закрыть по любому
            }
        } catch (IOException e) {
            throw new RuntimeException(e); // блокируем распространение Exception
        }
    }
}
