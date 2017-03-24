package ch15.ex13.local;

import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nGeneric Variable Length Check\n");
        List<String> ls = GenArgs.getList("A");
        System.out.println(ls);
        ls = GenArgs.getList("A","B","C"); // предыдущий список удален GC
        System.out.println(ls);
        ls = GenArgs.getList("System.out.println(\"Generic Variable Length Check\")".split("[\"\\.\\s+]"));
        System.out.println(ls);

    }
}
