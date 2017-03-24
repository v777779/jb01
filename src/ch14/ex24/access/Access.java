package ch14.ex24.access;

import ch14.ex24.access.factory.Part;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 24 INull Objects Check\n");

        List<Part> list = new ArrayList<>();
        for (int i = 0; i <25 ; i++) {
            list.add(Part.createRandom());
        }
        for (Part part : list) {
            System.out.printf("%-20s %-20s   NULL: %-25s  %-25s\n",part,part.getModel(),
                    Part.getNull(part.getClass()), Part.getNull(part.getClass()).getModel());
        }




    }
}
