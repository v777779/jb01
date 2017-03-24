package ch13.ex10;

import ch13.ex10.include.Include;
import ch13.ex10.access.Access;
import ch13.ex10.integra.Integra;
import ch13.ex10.local.Local;
import ch13.ex10.remote.Remote;

/**
 * Created by V1 on 06-Mar-17.
 */
public class Ex10 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Access.app();

    }
}
