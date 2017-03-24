package ch14.ex14.local;

import ch14.ex14.local.factory.Part;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nFactory IFace<T> Generic Check\n");

        List<Part> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Part.createRandom());
        }
        for (Part part : list) {
            System.out.println(part.getClass());

        }



    }
}
