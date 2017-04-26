package ch20.ex04.codeb;

import lib.units.atunit.Test;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtUnitCompositon {
    AtUnitExample1 testObject = new AtUnitExample1();

    @Test
    boolean _methodOne() {
        return testObject.methodOne().equals("This is methodOne");
    }

    @Test
    boolean _methodTwo() {
        return testObject.methodTwo() == 2;
    }


}
