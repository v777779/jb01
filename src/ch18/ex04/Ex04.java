package ch18.ex04;

import ch18.ex04.access.Access;
import ch18.ex04.include.Include;
import ch18.ex04.local.Local;

/**
 * Created by V1 on 06-Apr-17.
 */
public class Ex04 {
    public static void main(String[] args) {
        Local.app();
        Include.app(args);
        Access.app();

    }
}
