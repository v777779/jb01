package ch14.ex25.include;

import ch14.ex25.include.pkg.A;
import ch14.ex25.include.pkg.HiddenC;

import java.lang.reflect.Method;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    static void hiddenMethod(Object o, String name) {

        try {
            Method m =  o.getClass().getDeclaredMethod(name);
            m.setAccessible(true);
            m.invoke(o ); // если аргументов нет, можно без них
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nInterface Isolation Methods  Check\n");
        System.out.println("Package A:");
        A a = HiddenC.makeA(); // доступ к классу <class С> через <public class HiddenC>
        a.f();
        hiddenMethod(a,"g");
        hiddenMethod(a,"u");
        hiddenMethod(a,"v");
        hiddenMethod(a,"w");

//        if (a instanceof C) {  // так как class C скрыт,
//        }
        System.out.println("\nPackage AnonimA.A:");
        A aa = HiddenC.makeAnonimA();
        aa.f();
        hiddenMethod(aa,"g");
        hiddenMethod(aa,"u");
        hiddenMethod(aa,"v");
        hiddenMethod(aa,"w");




    }
}
