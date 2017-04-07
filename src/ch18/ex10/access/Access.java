package ch18.ex10.access;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app(String[] args) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 10 File Read Check\n");


        if (args == null || args.length == 0) {
            System.out.println("Usage: args[0] <filePath> args[1] = <search word>,..");
        }
        if (args.length == 0) {
            args = new String[]{"./src/ch18/ex10/access/Access.java", "list", "out"};
        }

        System.out.println("parameters: ");
        System.out.println("          : args[0]=" + args[0]);
        System.out.println("          : args[1]=" + args[1]);
        System.out.println("          : args[2]=" + args[2]);
        List<String> list = new LinkedList<>(BFileSearch.readList(args));
        System.out.println("\nStrings with words:"+args[1]+" "+args[2]);
        System.out.println("------------------------------");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
