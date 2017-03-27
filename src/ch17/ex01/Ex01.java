package ch17.ex01;

import ch17.ex01.access.Access;
import ch17.ex01.include.Include;
import ch17.ex01.integra.Integra;
import ch17.ex01.local.Local;
import ch17.ex01.remote.Remote;
import ch17.ex01.thrown.Thrown;

/**
 * Created by V1 on 26.03.2017.
 */
public class Ex01 {
    public static void main(String[] args) {
        Local.app();
        Include.app();
        Integra.app();
        Remote.app();
        Thrown.app();
        Access.app();

    }
}
