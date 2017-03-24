package ch11.ex04.access;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise List Next Remote  Check\n");

        StrGen st = new StrGen();

        System.out.println(Arrays.toString(st.fillArray(new String[5])));

        System.out.println(st.fillCollect(new ArrayList<String>(),10));
        System.out.println(st.fillCollect(new LinkedList<String>(),8));
        LinkedList<String> nlist = new LinkedList<>();
        System.out.println(st.fillCollect(new HashSet<String>(),18));
        System.out.println(st.fillCollect(new LinkedHashSet<String>(),10));

    }
}
