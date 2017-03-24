package ch.ex29;

import ch.ex29.access.Access;
import ch.ex29.include.Include;
import ch.ex29.integra.Integra;
import ch.ex29.local.Local;
import ch.ex29.remote.Remote;

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
