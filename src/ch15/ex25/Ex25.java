package ch.ex25;

import ch.ex25.access.Access;
import ch.ex25.include.Include;
import ch.ex25.integra.Integra;
import ch.ex25.local.Local;
import ch.ex25.remote.Remote;
import ch.ex25.thrown.Thrown;
import ch.ex25.unit.Unit;

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
