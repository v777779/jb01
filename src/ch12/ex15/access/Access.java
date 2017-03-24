package ch12.ex15.access;

import lib.except.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 15 Finally w RuntimeException Check\n");
        Switch sw = new Switch();
//        w finally
        System.out.println("------");
        try {
            try {
                sw.on();
                ExTools.fRt();                // генератор exceptions 1,2,4 уровня и Runtime Exception
            } catch (SwEx1 e) {
            } catch (SwEx2 e) {
            } finally {
                sw.off();                   // отработает finally и для  SwEx4 и для Runtime
            }
        } catch (SwEx4 e) {                 // сюда после finally хотя это catch
        } finally {
        }

    }
}
