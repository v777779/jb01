package ch13.ex16.access;

import java.io.File;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 16 File List Grep  Check\n");
        // работа с группой файлов
        String regex = "\\b[Ssct]\\w+";                  // вывести все слова с букв S* s* c* t*
        String fName = "src/ch13.ex15";
        File f = new File(fName);

        JGrep.fd(f,regex); // рекурсивный вызов заходим с уровнем 0



    }
}
