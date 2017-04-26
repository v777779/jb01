package lib.annot;

import lib.units.atunit.AtUnit;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtUnitExec {
    public static void check(String pathFile) {
        try {

            AtUnit.main(new String[]{pathFile});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
