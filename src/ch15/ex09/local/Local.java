package ch15.ex09.local;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nGeneric Methods Check\n");

        GMet gm = new GMet();
        gm.getT(new ArrayList<>());
        gm.getT(new HashMap<>());
        gm.getT(new Integer(1));
        gm.getT(new Character('1'));
        gm.getT(1);
        gm.getT(1L);
        gm.getT(1F);
        gm.getT(1.1);
        gm.getT("Str");

    }
}
