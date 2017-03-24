package ch12.ex30.access;

import ch12.ex27.local.SomeEx;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 30 RuntimeException Check\n");

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
                System.out.println("catch1:SomeEx");
            } catch (Sneeze e) {                        // не надо ничего оборачивать работает сразу
                System.out.println("catch2:Sneeze");
            } catch (Annoy e) {                         // не надо ничего оборачивать работает сразу
                System.out.println("catch2:Annoy");
            } catch (Throwable throwable) {  // это требование среды для getCause()
                System.out.println("catch2:Throwable");
            }
        }
    }
}
