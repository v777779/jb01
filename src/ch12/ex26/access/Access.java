package ch12.ex26.access;

import java.io.FileInputStream;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() throws Exception{
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 26 Uncontrolled Exception  Check\n");
// отправка Exception на консоль
        FileInputStream f = new FileInputStream("Main.java");
        f.close();

    }
}
