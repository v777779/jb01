package ch18.ex25.coded;

import java.io.File;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class CodeD {
    public static void app() {
        System.out.println("\n====CODE_D===");
        System.out.println("\nPerformance nio Check\n");
        MappedIO.check();


        for (File file : new File("./src/ch18/ex25").listFiles()) {
            if (file.getPath().endsWith(".txt")|| file.getPath().endsWith(".tmp")) {
                file.delete();
            }
        }

    }
}
