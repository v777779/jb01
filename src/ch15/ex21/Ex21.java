package ch.ex21;

import ch.ex21.access.Access;
import ch.ex21.include.Include;
import ch.ex21.integra.Integra;
import ch.ex21.local.Local;
import ch.ex21.remote.Remote;

/**
 * Created by V1 on 17.03.2017.
 */
public class Ex21 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Access.app();

    }
}
