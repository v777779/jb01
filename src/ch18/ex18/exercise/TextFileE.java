package ch18.ex18.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by V1 on 10-Apr-17.
 */
public class TextFileE extends ArrayList<String> {
    // данные Класса
    public static String read(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder(); // набор строки

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
        return sb.toString();
    }

    public static void write(String fileName, String text) throws IOException {
        File file = new File(fileName).getAbsoluteFile();  // все таки это файл по полному абсолютному пути
        PrintWriter out = new PrintWriter(file); // с файлом по абсолютному пути
        try {
            out.print(text);

        } finally {
            out.close(); // закрыть по любому
        }
    }

    // данные Объекта
// конструкторы
    public TextFileE(String fileName, String splitter) throws IOException {  // конструктор
        super(Arrays.asList(read(fileName).split(splitter)));
        if (get(0).equals("")) {  // заплатка
            remove(0);
        }
    }

    public TextFileE(String fileName) throws IOException {  // конструктор
//        super(Arrays.asList(read(fileName).split('\n'));  вместо этого вызывается предыдущий конструктор
        this(fileName, "\n");  // предыдущий конструктор
    }

    // методы
    public void write(String fileName) throws IOException {  // запись экземпляра  this.ArrayList
            File file = new File(fileName).getAbsoluteFile();  // все таки это файл по полному абсолютному пути
            PrintWriter out = new PrintWriter(file); // с файлом по абсолютному пути
            try {
                for (String s : this) {  // это же ArrayList
                    out.print(s);
                }

            } finally {
                out.close(); // закрыть по любому
            }
    }
}
