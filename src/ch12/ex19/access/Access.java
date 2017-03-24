package ch12.ex19.access;

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

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 19 Protect from Lost Exception Check\n");

// Способ 1 замещение
        System.out.println("Method1: protect from lost Exception:");
        try {
            try {
                f();
            } catch (VIPException e) {
                System.out.println(e);
            } finally {
                dispose();
            }
        } catch (STDException e) {
            System.out.println(e); // потеря VIPException
        }

    }
}
