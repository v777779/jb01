package ch14.ex24.integra;

import ch14.ex24.integra.factory.INull;
import ch14.ex24.integra.factory.Part;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\n  Check\n");

        List<Part> list = new ArrayList<>();
        for (int i = 0; i <25 ; i++) {
            list.add(Part.createRandom());
        }
        for (Part part : list) {
            System.out.printf("%-20s : Model: %-20s  NULL: %-25s Model: %-20s  INull:%b\n",part,part.getModel(),
                    part.getNull(),part.getNull().getModel(),(part.getNull() instanceof INull));
        }

    }
}
