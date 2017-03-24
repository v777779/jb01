package ch.ex28;

import ch.ex28.include.Include;
import ch.ex28.local.Local;
import ch.ex28.remote.Remote;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Ex28 {
    public static void main(String[] args) {
        System.out.println("\nInner Class Redefinition Check\n");
        Local.app();
        System.out.println("\nInner Class Inheritance Class Check\n");
        Include.app();
        System.out.println("\nInner BLock Class Check\n");
        Remote.app();
    }
}
