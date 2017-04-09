package ch18.ex11.access;

import lib.orange.GCFileRead;
import lib.orange.HumidityControl;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 11 Check\n");

        HumidityControl gc = new HumidityControl();          // создали объект оранжерея
        String fileName = "./src/ch18/ex11/exercise/EventsList.java";
        GCFileRead.events(gc, fileName);  // прочитали и упаковали
        gc.run(); // запустили


    }
}
