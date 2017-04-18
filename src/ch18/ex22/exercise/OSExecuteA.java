package ch18.ex22.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 10-Apr-17.
 */
public class OSExecuteA {
    public static List<String> command(String command) {  // OS command to exec
        boolean err = false;
        System.out.println("Test Standard Out");
        System.err.println("Test Error Out");
        List<String> errList = new ArrayList<>();
        try {
            Process process = new ProcessBuilder(command.split(" ")).start(); // создать новый процесс
            BufferedReader results = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = results.readLine()) != null) {  // данные с процесса выводить на консоль out
                System.out.println(s);
            }
            BufferedReader errors = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));
            while ((s = errors.readLine()) != null) {  // данные с процесса выводить на консоль error
                errList.add(s);
                System.err.println(s);  //  не печатаем на системный вызов
                err = true;
                try {
                    if (err) {  // была ошибка
                        throw new OSExecuteExceptionA("Errors executing " + command);
                    }
                } catch (Exception e) {
                    StringWriter sw = new StringWriter(1);
                    PrintWriter errOut = new PrintWriter(sw);
                    e.printStackTrace(errOut);

                    String[] strings = sw.toString().split("\r\n");
                    errList.addAll(Arrays.asList(strings));
                }

            }
        } catch (Exception e) {
            if (command.toLowerCase().startsWith("cmd /c")) {
                command("cmd /c " + command);
            } else {
                throw new RuntimeException(e);
            }
        }

        return errList;
    }
}
