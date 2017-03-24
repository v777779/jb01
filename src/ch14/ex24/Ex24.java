package ch14.ex24;

import ch14.ex24.access.Access;
import ch14.ex24.include.Include;
import ch14.ex24.integra.Integra;
import ch14.ex24.local.Local;
import ch14.ex24.remote.Remote;

/**
 * Created by V1 on 12-Mar-17.
 */
public class Ex24 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Access.app();

    }
}
