package ch18.ex09.access;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app(String[] args) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 9 File InOut Check\n");

        if (args == null || args.length == 0) {
            System.out.println("Usage: args[0] <filePath>");
        }
        if (args.length == 0) {
            args = new String[]{"./src/ch18/ex09/access/Access.java"};
        }
        List<String> list = new LinkedList<>(BFileReadUp.readList(args[0]));
        ListIterator<String> lit = list.listIterator(list.size());
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

    }
}
