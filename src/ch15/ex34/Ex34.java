package ch15.ex34;

import ch15.ex34.access.Access;
import ch15.ex34.include.Include;
import ch15.ex34.integra.Integra;
import ch15.ex34.local.Local;
import ch15.ex34.remote.Remote;

/**
 * Created by V1 on 21.03.2017.
 */
public class Ex34 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Access.app();

    }
}
