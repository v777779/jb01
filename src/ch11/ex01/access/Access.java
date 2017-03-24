package ch11.ex01.access;

import lib.utils.Range;

import java.util.ArrayList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void getFillArray(ArrayList g, int number) {
        for (int i = 0; i < 20; i++) {
            g.add(new Gerbil(Range.getInt(100)));
        }
    }

    public static void app() {
        System.out.println("====ACCESS===");
        System.out.println("\nExercise 1 Generics Check\n");
        ArrayList<Gerbil> g = new ArrayList<>();
        getFillArray(g, 20);
        System.out.println("\nIteration via fori");
        for (int i = 0; i < g.size() ; i++) {
            g.get(i).hop();
        }

        System.out.println("\nIteration via foreach");
        for (Gerbil gerbil : g) {
            gerbil.hop();
        }

    }
}
