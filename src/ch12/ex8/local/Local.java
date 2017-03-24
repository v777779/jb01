package ch12.ex8.local;

import lib.utils.Time;

import java.awt.datatransfer.MimeTypeParseException;
import java.rmi.UnknownHostException;
import java.security.acl.LastOwnerException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    private static void f(int check) throws LastOwnerException, MimeTypeParseException, UnknownHostException {
        if (check == 1) {
            throw new LastOwnerException();
        }
        if (check == 2) {
            throw new MimeTypeParseException();
        }
        if (check == 3) {
            throw new UnknownHostException(null);
        }
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nThrows Check\n");
        Time.sleep();
        int k = 1;
        while (k < 5) {
            try {
                f(k++);    // ловит исключения разные и выводит
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        Time.sleep();
        System.out.println("\nMoved via Exceptions");
    }
}
