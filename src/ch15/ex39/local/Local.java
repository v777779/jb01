package ch.ex39.local;

import ch.ex39.local.mixing.*;
import lib.tuples.TwoTuple;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMixing and Proxy Check\n");
        Object mixing = MixingProxy.newInstance(  // передать массив объектов и классов
                new TwoTuple<Object,Class<?>>(new Basic(),IBasic.class),
                new TwoTuple<Object,Class<?>>(new TimeStamp(),ITimeStamp.class),
                new TwoTuple<Object,Class<?>>(new SerialNumber(),ISerialNumber.class)
        );

        IBasic b = (IBasic)mixing;                // Object может быть любым
        ITimeStamp t = (ITimeStamp)mixing;        //
        ISerialNumber s = (ISerialNumber)mixing;  //
        b.setString("String Base");
        System.out.println("b:"+b.getString());
        System.out.println("t:"+t.getStamp());
        System.out.println("s:"+s.getSerialNumber());



    }
}
