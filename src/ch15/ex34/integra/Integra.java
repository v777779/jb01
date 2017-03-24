package ch.ex34.integra;

import ch.ex34.integra.notsb.*;
import ch.ex34.integra.sb.*;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nSelfBounded Generic Check\n");

        SubHolder sb1 = new SubHolder();
        sb1.setElement(new SubHolder());
        BasicHolder sb2 = sb1.getElement();
        sb1.f();

        SubMover sm1 = new SubMover();
        sm1.setElement(new SubMover());  // задать элемент
        SubMover sm2 = sm1.getElement();
        sm1.f();


        System.out.println("SelfBound ClassA ClassB ClassC:");
        ClassA a = new ClassA();
        a.set(new ClassA());
        a = a.get();
        System.out.println("a:" + a.getClass().getSimpleName());

        ClassB b = new ClassB();
        b.set(new ClassA());
        a = b.get();
        System.out.println("b:" + b.getClass().getSimpleName());
        System.out.println("a:" + a.getClass().getSimpleName());

        ClassC c = new ClassC();
        c.set(new ClassC());
        c = c.get();
        System.out.println("c:" + c.getClass().getSimpleName());

        ClassE e = new ClassE();
        e.set(new ClassA());
        SelfBound s = e.get();
        System.out.println("e:" + e.getClass().getSimpleName());
        System.out.println("s:" + s.getClass().getSimpleName());

        System.out.println("Not SelfBound ClassA2 ClassB2 ClassC2:");
        ClassA2 a2 = new ClassA2();
        a2.set(new ClassA2());
        a = a.get();
        System.out.println("a2:" + a2.getClass().getSimpleName());

        ClassB2 b2 = new ClassB2();
        b2.set(new ClassA2());
        a2 = b2.get();
        System.out.println("b2:" + b2.getClass().getSimpleName());
        System.out.println("a2:" + a2.getClass().getSimpleName());

        ClassC2 c2 = new ClassC2();
        c2.set(new ClassC2());
        c2 = c2.get();
        System.out.println("c2:" + c2.getClass().getSimpleName());

        ClassE2 e2 = new ClassE2();
        e2.set(new ClassD2());
        ClassD2 d2 = e2.get();
        System.out.println("d2:" + d2.getClass().getSimpleName());
        System.out.println("e2:" + e2.getClass().getSimpleName());


    }
}
