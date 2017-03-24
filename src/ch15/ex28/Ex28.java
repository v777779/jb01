package ch.ex28;

import ch.ex28.access.Access;
import ch.ex28.include.Include;
import ch.ex28.integra.Integra;
import ch.ex28.local.Local;
import ch.ex28.remote.Remote;

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
