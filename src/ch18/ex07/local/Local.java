package ch18.ex07.local;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nFile Input Check\n");

        System.out.println("Read file Local.java:");
        try {
            System.out.println(BufferedInputFileSet.read("./src/ch18/ex07/local/Local.java"));
        } catch (IOException e) {
            System.out.println("catch: IO exception");
        }
        System.out.println("\nTreeSet from file:");
        System.out.println("==================");
        Set<String> tSet = new TreeSet<>(BufferedInputFileSet.getList());
        for (String s : tSet) {
            System.out.println(s);
        }

    }
}
