package ch11.ex04.remote;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nExercise List Next Remote  Check\n");

        Movie m = new Movie();
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> nlist = new LinkedList<>();
        HashSet<String> hset = new HashSet<>();
        LinkedHashSet<String> lset = new LinkedHashSet<>();
        LinkedHashSet<String> lset2 = new LinkedHashSet<>();

        m.gen(list);    // сгенерировали список имен
        m.show(list);   // прокрутили

        m.gen(nlist);
        m.show(nlist, 8);

        m.gen(hset);
        m.show(hset, 18);

        m.gen(lset);
        m.show(lset, 10);

        m.gen(lset);
        m.show(lset, 10);



    }
}
