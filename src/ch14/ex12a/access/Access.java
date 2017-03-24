package ch14.ex12a.access;

import ch14.ex12a.access.factory.Part;
import ch14.ex12a.access.factory.TypeCount;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12a Class Map Check\n");
        TypeCount tc = new TypeCount(Part.class);   // вытаскивает всю иерархию классов
        for (int i = 0; i < 25; i++) {
            tc.count(Part.createRandom());
        }
        System.out.println(tc);

        for (Class<?> aClass : tc.keySet()) {
            System.out.println(aClass);
        }


    }
}
