package ch11.ex04;

import ch11.ex04.access.Access;
import ch11.ex04.include.Include;
import ch11.ex04.integra.Integra;
import ch11.ex04.local.Local;
import ch11.ex04.remote.Remote;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Ex4 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Access.app();

    }
}
