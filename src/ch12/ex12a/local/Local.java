package ch12.ex12a.local;

import java.awt.datatransfer.MimeTypeParseException;
import java.rmi.UnknownHostException;
import java.security.acl.LastOwnerException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    private static void f(int c) throws Exception {
        switch (c) {
            default:
                throw new Exception();
            case 1:
                throw new LastOwnerException();
            case 2:
                throw new MimeTypeParseException();
            case 3:
                throw new UnknownHostException(null);
        }

    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nFinally  Check\n");

        for (int i = 0; i < 5; i++) {
            try {
                f(i);
            } catch (LastOwnerException e) {
                System.out.printf("catch%d: <LastOwnerException    >  ", i);

            } catch (MimeTypeParseException e) {
                System.out.printf("catch%d: <MimeTypeParseException>  ", i);

            } catch (UnknownHostException e) {
                System.out.printf("catch%d: <UnknownHostException  >  ", i);

            } catch (Exception e) {
                System.out.printf("catch%d: %-24s  ", i, e.getClass().getSimpleName());

            } finally {
                System.out.println("finally:" + i);
            }
        }
        System.out.println("cycle finished");
    }
}
