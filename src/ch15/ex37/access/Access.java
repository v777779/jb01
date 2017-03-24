package ch.ex37.access;

import ch.ex37.access.mixing.BasicMixing;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 37 Mixing Check\n");
        BasicMixing bm1 = new BasicMixing();

        bm1.setString("Set String For Basic Mixing");
        System.out.println("bm1:"+bm1.getString()+" t:"+bm1.getStamp()+" sn:"+bm1.getSerialNumber()+
                           " c:"+bm1.getColor());

    }
}
