package ch15.ex25;

import ch15.ex25.access.Access;
import ch15.ex25.include.Include;
import ch15.ex25.integra.Integra;
import ch15.ex25.local.Local;
import ch15.ex25.remote.Remote;
import ch15.ex25.thrown.Thrown;
import ch15.ex25.unit.Unit;

/**
 * Created by V1 on 18.03.2017.
 */
public class Ex25 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Thrown.app();
        Unit.app();
        Access.app();


    }
}
