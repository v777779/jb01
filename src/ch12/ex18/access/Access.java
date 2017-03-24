package ch12.ex18.access;

import ch12.ex18.local.STDException;
import ch12.ex18.local.VIPException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void f() throws VIPException {
        throw new VIPException();
    }

    private static void dispose() throws STDException {
        throw new STDException();
    }

    private static void nop() throws NOPException {
        throw new NOPException();
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 18 Lost Exceptions Check\n");

// Способ 1 замещение
        System.out.println("Method1: replacement Exception:");
        try {
            try {
                f();
            } finally {
                try {
                    dispose();
                } finally {  // перехватили и потеряли уже два сообщения
                    nop();
                }
            }
        } catch (Exception e) {
            System.out.println(e); // потеря VIPException
        }

// Ловим все исключения
        System.out.println("\nMethod2: catch all exceptions:");
        try {
            try {
                f();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    dispose();
                } catch (Exception e) {
                    System.out.println(e);
                } finally {  // перехватили и потеряли уже два сообщения
                    nop();
                }
            }
        } catch (Exception e) {
            System.out.println(e); // потеря VIPException
        }
    }


}
