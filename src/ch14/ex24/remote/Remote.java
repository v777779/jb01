package ch14.ex24.remote;

import ch14.ex24.remote.factory.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nDynamic Proxy IPart Check\n");
        List<IPart> list = new ArrayList<>();
        for (int i = 0; i <25 ; i++) {
            list.add(Part.createRandom());
        }
        for (IPart part : list) {
            System.out.printf("%-20s %-20s   NULL: %-25s  %-25s\n",part,part.getModel(),
                    Part.getNull(part.getClass()), Part.getNull(part.getClass()).getModel());
        }


    }
}
