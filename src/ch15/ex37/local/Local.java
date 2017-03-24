package ch.ex37.local;

import ch.ex37.local.mixing.BasicMixing;
import ch.ex37.local.mixing.TimeStamp;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMixing Check\n");
        BasicMixing bm1 = new BasicMixing();
        BasicMixing bm2 = new BasicMixing();

        System.out.println("Mixing Realization:");
        bm1.setString("It's string Base1");
        bm2.setString("It's new string Base2");

        System.out.println("bm1:"+bm1.getString()+" time:"+bm1.getStamp()+" sn:"+bm1.getSerialNumber());
        System.out.println("bm2:"+bm2.getString()+" time:"+bm2.getStamp()+" sn:"+bm2.getSerialNumber());
        TimeStamp t = new TimeStamp();
        System.out.println("t:"+t.getStamp()+" mills:"+t.getTimeStamp2());

    }
}
