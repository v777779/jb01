package ch.ex38.local;

import ch.ex38.local.decorator.*;


/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nDecorator w Generic Check\n");

        TimeStamp  t = new TimeStamp(new Basic());
        SerialNumber sn = new SerialNumber(new Basic());

        t.setString("t  :");
        sn.setString("sn :");

        TimeStamp st = new TimeStamp(new SerialNumber(new Basic()));

        System.out.println("t :"+t.getString()+" > "+t.getStamp());
        System.out.println("sn:"+sn.getString()+" > "+sn.getSerialNumber());
//        System.out.println("st:"+st.getString()+" > "+ st.getSerialNumber()+" > "+st.getStamp());  // не берет

    }
}
