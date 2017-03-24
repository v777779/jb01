package ch15.ex29;

import ch15.ex29.access.Access;
import ch15.ex29.include.Include;
import ch15.ex29.integra.Integra;
import ch15.ex29.local.Local;
import ch15.ex29.remote.Remote;

/**
 * Created by V1 on 20.03.2017.
 */
public class Ex29 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Access.app();

    }
}
