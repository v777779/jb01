package ch20.ex11.exercise;

import lib.units.atunit.Test;
import lib.units.atunit.TestNote;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtNote {
    private int basicInt = 0;
    private String basicString = "String";

    @TestNote("Parent Field.basicIntValue")
    private int basicIntValue = 15;

    @TestNote("Parent Field.basicStringValue")
    private String basicStringValue = "String_Value";

    public int basicIntPublic = 12;
    public String basicStringPublic = "StringPublic";

    @TestNote("Parent. Field.basicIntPublicValue")
    public int basicIntPublicValue = 125;

    @TestNote("Parent. Field.basicStringPublicValue")
    public String basicStringPublicValue = "StringPublicValue";

    @Test
    public void basicCheckField() {

    }

}
