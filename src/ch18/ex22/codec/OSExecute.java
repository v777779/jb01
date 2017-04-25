package ch18.ex22.codec;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 10-Apr-17.
 */
public class OSExecute {
    public static void command(String command) {  // OS command to exec
        boolean err = false;
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
            while ((s = results.readLine()) != null) {  // данные с процесса выводить на консоль error
                System.err.println(s);  //
                err= true;
            }
        } catch (Exception e) {
            if (command.toLowerCase().startsWith("cmd /c")) {
                command("cmd /c " + command);
            } else {
                throw new RuntimeException(e);
            }
        }

        if (err) {  // была ошибка
            throw new OSExecuteException("Errors executing " + command);
        }

    }
}
