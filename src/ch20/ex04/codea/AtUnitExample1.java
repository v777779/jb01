package ch20.ex04.codea;

import org.junit.Test;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 25-Apr-17.
 */
public class AtUnitExample1 {
    public String methodOne() {
        return "This is methodOne";
    }
    public int methodTwo() {
        System.out.println( "This is methodTwo");
        return 2;
    }

    @Test boolean methodOneTest() {
        return methodOne().equals("This is methodOne");
    }

    @Test boolean m2() {
        return (methodTwo() == 2);
    }

    @Test private  boolean m3() {
        return true;
    }
// Shows output for failure
    @Test boolean failureTest() {
        return false;
    }

    @Test boolean anotherDissappointment() {
        return false;
    }
}
