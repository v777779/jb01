package ch14.ex01;

import ch14.ex01.access.Access;
import ch14.ex01.include.Include;
import ch14.ex01.integra.Integra;
import ch14.ex01.local.Local;

/**
 * Created by V1 on 07-Mar-17.
 */
public class Ex1 {
    public static void main(String[] args) throws Exception {
        Local.app();
        Include.app();
        Integra.app();
        Access.app();

    }
}
