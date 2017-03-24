package ch15.ex09.access;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 9 Generic Methods Check\n");
        GMetN.getT(new ArrayList<>(),new HashMap<>(),new Integer(1));
        GMetN.getT(new Character('1'),1,1L);
        GMetN.getT(1F,1.1,"Str");

    }
}
