package ch12.ex14.access;


import lib.except.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 14 RuntimeException vs Finally Check\n");
        Switch sw = new Switch();

//        wo finally
            System.out.println("------");
            try {
                try {
                    sw.on();
                    ExTools.fRt();                // генератор exceptions 1,2,4 уровня и Runtime Exception
                    sw.off();
                } catch (SwEx1 e) {
                    sw.off();     // отработает finally и для  SwEx4

                } catch (SwEx2 e) {
                    sw.off();     // отработает finally и для  SwEx4

                }
            } catch (SwEx4 e) {   // сюда после finally хотя это catch
                sw.off();     // отработает finally и для  SwEx4
            }


    }
}
