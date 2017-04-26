package ch20.ex04.codeb;


import lib.units.atunit.Test;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtUnitExternalTest extends AtUnitExample1 {
    @Test
    boolean _methodOne() {
        return methodOne().equals("This is methodOne1");
    }
    @Test
    boolean testMethodOne() {
        return methodOne().equals("This is methodOne");
    }

    @Test
    boolean _methodTwo() {
        return methodTwo() == 2;
    }
    @Test
    boolean testMethodTwo() {
        return methodTwo() == 1;
    }



}
