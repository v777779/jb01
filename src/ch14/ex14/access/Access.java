package ch14.ex14.access;

import ch14.ex14.access.factory.Part;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 14 Factory Class Check\n");
        List<Part> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Part.createRandom());
        }
        for (Part part : list) {
            System.out.println(part.getClass());

        }

    }
}
