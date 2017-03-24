package ch.ex39.access;

import ch.ex39.access.mixing.*;
import lib.tuples.TwoTuple;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 39 Dynamic Mixing Proxy Check\n");
        Object mixProxy = MixingProxy.newInstance(  // передать массив объектов и классов
                new TwoTuple<Object,Class<?>>(new Basic(),IBasic.class),
                new TwoTuple<Object,Class<?>>(new TimeStamp(),ITimeStamp.class),
                new TwoTuple<Object,Class<?>>(new SerialNumber(),ISerialNumber.class),
                new TwoTuple<Object,Class<?>>(new ColorR(),IColor.class)
        );

        ((IBasic)mixProxy).setString("String Base");
        System.out.println("b:"+((IBasic)mixProxy).getString());
        System.out.println("t:"+((ITimeStamp)mixProxy).getStamp());
        System.out.println("s:"+((ISerialNumber)mixProxy).getSerialNumber());
        System.out.println("c:"+((IColor) mixProxy).getColor());
    }
}
