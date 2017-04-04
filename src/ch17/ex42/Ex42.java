package ch17.ex42;

import ch17.ex42.access.Access;
import ch17.ex42.include.Include;
import ch17.ex42.integra.Integra;
import ch17.ex42.local.Local;
import ch17.ex42.remote.Remote;
import ch17.ex42.thrown.Thrown;
import ch17.ex42.unit.Unit;
import ch17.ex42.value.Value;

/**
 * Created by V1 on 03-Apr-17.
 */
public class Ex42 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Thrown.app();
        Unit.app();
        Value.app();
        Access.app();

    }

}
