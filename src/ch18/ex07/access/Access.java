package ch18.ex07.access;

import lib.files.BFileRead;

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

        System.out.println("Home solution:");
        String s = BFileRead.readString("./src/ch18/ex07/local/Local.java");
        List<String> list = new LinkedList<>(Arrays.asList(s.split("\n")));
        ListIterator<String> lit = list.listIterator(list.size()); // встать на последний элемент
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        System.out.println("\nOfficial solution:");
        List<String> listOffice = new LinkedList<>(BFileRead.readList("./src/ch18/ex07/local/Local.java"));

        ListIterator<String> litOffice = listOffice.listIterator(list.size()); // встать на последний элемент
        while (litOffice.hasPrevious()) {
            System.out.println(litOffice.previous());
        }

    }
}
