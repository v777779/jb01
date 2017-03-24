package ch13.ex20;

import ch13.ex20.access.Access;
import ch13.ex20.include.Include;
import ch13.ex20.integra.Integra;
import ch13.ex20.local.Local;
import ch13.ex20.recount.Recount;
import ch13.ex20.remote.Remote;

/**
 * Created by V1 on 07-Mar-17.
 */
public class Ex20 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Recount.app();
        Access.app();

    }
}
