package ch20.ex08.codea;

import lib.units.atunit.Test;
import lib.units.atunit.TestObjectCreate;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtUnitExample3 {
    private int n;

    public AtUnitExample3(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");;
        return 2;
    }

    @TestObjectCreate
    public static AtUnitExample3 create() {
        return new AtUnitExample3(15);
    }

    @Test
    boolean initialization() {
        return n == 15;
    }

    @Test
    boolean methodOneTest() {
        return methodOne().equals("This is methodOne");
    }

    @Test
    boolean m2() {
        return methodTwo() == 2;
    }

}
