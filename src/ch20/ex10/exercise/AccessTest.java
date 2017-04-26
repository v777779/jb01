package ch20.ex10.exercise;

import ch20.ex10.exercise.access.Access;
import lib.units.atunit.Test;
import lib.units.atunit.TestObjectCreate;
import lib.units.atunit.TestProperty;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AccessTest extends Access {
    @TestProperty
    private static Class classTest;
    @TestProperty
    private static String className;

    public AccessTest(String cName) {
        super(cName);
    }

    @TestObjectCreate
    public static AccessTest create() {
        className = "ch20.ex10.exercise.access.FancyToy";
        try {
            classTest = Class.forName(className);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new AccessTest(className);
    }

    @Test
    void _printInfo() {
        String sOut = printInfo(classTest);
        String sCmp = "1:SimpleName:FancyToy                  interface:false";

        assert sOut.contains(sCmp):": error";

    }

    @Test
    boolean _app() {
        PrintStream old = System.out;
        PrintStream newOut = new PrintStream(new ByteArrayOutputStream());
        System.setOut(newOut);  // отправили вникуда
        app();
        System.setOut(old);
        newOut.close();
        return getSB().toString().contains("FancyToy") &&
                getSB().toString().contains("3:SimpleName:WaterProof") &&
                getC().equals(classTest);
    }

}
