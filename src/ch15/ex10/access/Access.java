package ch15.ex10.access;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 10 Generic Methods Check\n");
        GMetK.getT(new ArrayList<>(),new HashMap<>(),new Integer(1));
        GMetK.getT(new Character('1'),1,15);
        GMetK.getT(1F,1.1,12);

    }
}
