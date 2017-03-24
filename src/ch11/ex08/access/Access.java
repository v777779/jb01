package ch11.ex08.access;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    private static ArrayList<Gerbil> getList(ArrayList<Gerbil> g) {
        for (int i = 0; i < 20; i++) {  // на 20 элементов
//            g.add(new Gerbil(Range.getInt(100)));
            g.add(new Gerbil(i));
        }
        return g;
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 8 Iterator Check\n");

        ArrayList<Gerbil> g = getList(new ArrayList<Gerbil>()); // создание и инициализация

        Iterator<Gerbil> it = g.iterator();
        while (it.hasNext()) {
           it.next().hop();
        }

    }
}
