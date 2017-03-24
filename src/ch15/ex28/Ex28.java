package ch15.ex28;

import ch15.ex28.access.Access;
import ch15.ex28.include.Include;
import ch15.ex28.integra.Integra;
import ch15.ex28.local.Local;
import ch15.ex28.remote.Remote;

/**
 * Created by V1 on 20.03.2017.
 */
public class Ex28 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Access.app();

    }
}
