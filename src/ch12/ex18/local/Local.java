package ch12.ex18.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    private static void f() throws VIPException {
        throw new VIPException();
    }

    private static void dispose() throws STDException {
        throw new STDException();
    }

    private static void n() {
        throw new NullPointerException();
    }
    private static void u() {
        throw new UnsupportedOperationException();
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nFinally Lost Exception Check\n");
// Способ 1 замещение
        System.out.println("Method1: replacement Exception:");
        try {
            try {
                f();  // здесь генерится VIPException
            } finally {
                dispose();  // здесь генерится STDException
            }
        } catch (Exception e) {
            System.out.println(e); // видим только STDException потеря VIPException
        }

// Способ 2 использование return в finally
        System.out.println("Method2: return in finally:");
        try {
            try {
                f();    // здесь генерится VIPException
            } finally {
              return;   // отрубает все исключения при возврате
            }           // не видим ничего вообще
        } catch (Exception e) {
            System.out.println(e); // потеря VIPException
        }


    }

}
