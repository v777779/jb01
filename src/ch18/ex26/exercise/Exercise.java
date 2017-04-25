package ch18.ex26.exercise;

import ch18.ex26.exercise.office.JGrepFCOffice;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 13-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 26 Grep with FileChannel Check\n");
        System.out.println("Grep search engine:");
        String regex = "\\bfile\\w+"; // вывести все слова с file*

        String stdCharset = System.getProperty("file.encoding");
        System.out.println(stdCharset);
        String fileName = "./src/ch18/ex26/exercise/";
        JGrepFC jp = new JGrepFC(fileName,regex);
        jp.find();

        System.out.println("\nOfficial solution:");

        JGrepFCOffice jp2 = new JGrepFCOffice(fileName,regex);
        jp2.find();
    }
}
