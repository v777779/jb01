package ch18.ex22.codeb;

import java.io.*;

/**
 * Created by V1 on 10-Apr-17.
 */
public class RedirectStream {
    public static void check() {

        String fileRead = "./src/ch18/ex22/codeb/RedirectStream.java";
        String fileWrite = "./src/ch18/ex22/codeb/RedirectStream.txt";
//        System.out.println("Test standard out");
//        System.err.println("Test error out");

        PrintStream console = System.out;  // просто ссылка на  объект
        PrintStream error = System.err;  // просто ссылка на  объект
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileRead));
            PrintStream out = new PrintStream(new BufferedOutputStream(
                    new FileOutputStream(fileWrite)));

            System.setIn(in); // переключить на новый поток из файла
            System.setOut(out); // переключить на новый поток в файл
            System.setErr(out); // ошибки тоже на новый поток в файл

// ВНИМАНИЕ. здесь уже действуют потоки клиента
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s;                                   //br это буферизованная версия потока клиента
            while ((s = br.readLine()) != null) {       // ввод из файла
                System.out.println(s.toUpperCase());   // вывод в файл
            }
            out.close(); // закрыть поток вывода
            in.close();  // закрыть поток ввода

            System.setOut(console);                 // восстановление потока вывода системного
            System.setErr(error);                   // восстановление потока вывода системного

//            System.out.println("Test standard out");
//            System.err.println("Test error out");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File RedirectStream.txt has been written");
    }
}
