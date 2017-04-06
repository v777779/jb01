package ch18.ex07.access;

import ch18.ex07.local.BufferedInputFileSet;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 7 File Reader Check\n");
        String s = "";
        try {
            s = BufferedInputFileSet.read("./src/ch18/ex07/local/Local.java");
        } catch (IOException e) {
            System.out.println("catch: IO exception");
        }

        List<String> list = new LinkedList<>(Arrays.asList(s.split("\n")));
        ListIterator<String> lit = list.listIterator(list.size()); // встать на последний элемент
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
