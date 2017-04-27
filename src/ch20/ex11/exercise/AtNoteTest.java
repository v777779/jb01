package ch20.ex11.exercise;

import lib.units.atunit.Test;
import lib.units.atunit.TestNote;
import lib.units.atunit.TestObjectCreate;
import lib.units.atunit.TestProperty;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
@TestNote("Class name: AtNoteTest")
public class AtNoteTest extends AtNote{

    @TestNote("<>Class Field: int n")
    private int n;

    @TestNote("Class Constructor(int n)")
    public AtNoteTest(int n) {
        this.n = n;
    }

    @TestNote("Class method: getN()")
    public int getN() {
        return n;
    }

    @TestNote("Class method: setN()")
    public void setN(int n) {
        this.n = n;
    }

    @TestObjectCreate
    @TestNote("Test Object Create Method: create()")
    public static AtNoteTest create() {
        count++;
        return new AtNoteTest(count++);
    }

    @TestProperty
    @TestNote("Test Field : count")
    public static int count = 0;


    @Test
    @TestNote("Test Method : _getN()")
    boolean _getN() {
        return true;
    }

    @Test
    @TestNote("Test Method : _setN()")
    boolean _setN() {

        return true;
    }

    @Test
    public void _checkField() {

    }


}
