package ch17.ex15;

import ch17.ex15.access.Access;
import ch17.ex15.include.Include;
import ch17.ex15.integra.Integra;
import ch17.ex15.local.Local;
import ch17.ex15.remote.Remote;
import ch17.ex15.thrown.Thrown;

/**
 * Created by V1 on 30-Mar-17.
 */
public class Ex15 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Thrown.app();
        Access.app();

    }
}
