package ch12.ex27.local;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nConversion Exceptions Check\n");
        WrapRTE rte = new WrapRTE();

        rte.throwRTEx(3); // просто отработать return

        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3) {
                    rte.throwRTEx(i);
                } else {
                    throw new SomeEx(); // улетает наверх
                }
            } catch (SomeEx e) {
                System.out.println("catch:SomeEx");
            } catch (RuntimeException re) {   // отрабатываем контейнер RT
                try {                           // можно switch, можно try_catch
                    System.out.println("case:" + re.getCause());  // это исходное Exception
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    System.out.println("catch2:FileNotFound");
                } catch (IOException e) {
                    System.out.println("catch2:IOException");

                } catch (ClassCastException e) {
                    System.out.println("catch2:ClassCast");

                } catch (Throwable throwable) {  // это требование среды для getCause()
                    System.out.println("catch2:Throwable");
                }
            }
        }

    }
}
