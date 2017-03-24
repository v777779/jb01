package ch11.ex09.access;

import java.util.Iterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 9 Iterator Check\n");
        Sequence sq = new Sequence(20); // на 20 элементов
        Iterator it = sq.getIt();
        System.out.println("Sequence with Iterator");
        while (it.hasNext()) {
            System.out.print(it.next()+" " );
        }
    }
}
