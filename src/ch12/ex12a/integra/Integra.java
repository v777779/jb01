package ch12.ex12a.integra;

import java.util.Random;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    private static void f() throws SwEx1, SwEx2, SwEx4 {
        int valRnd = new Random().nextInt(8);
        if (valRnd == 1) {
            throw new SwEx1();
        }
        if (valRnd == 2) {
            throw new SwEx2();
        }
        if (valRnd > 4) {
            throw new SwEx4();
        }
    }

    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nFinally Resource Free Check\n");
        Switch sw = new Switch();

// wo finally
        System.out.println("Try_Catch_wo_Finally:");
        try {
            sw.on();
            f();
            sw.off();
        } catch (SwEx1 e) {
            System.out.print("catch:" + e.getClass().getSimpleName() + ":");
            sw.off();

        } catch (SwEx2 e) {
            System.out.print("catch:" + e.getClass().getSimpleName() + ":");
            sw.off();
        } catch (Exception e) {
            System.out.print("catch:" + e.getClass().getSimpleName() + ":");
            sw.off();
        }


// w finally
        System.out.println("Try_Catch_w_Finally:");
        try {
            try {
                sw.on();
                f();                // генератор exceptions 1,2,4 уровня
            } catch (SwEx1 e) {     // отработает  SwEx1
                System.out.println("catch: SwEx1");
            } catch (SwEx2 e) {    // отработает  SwEx1
                System.out.println("catch: SwEx2");
            } finally {
                System.out.print("finally:");
                sw.off();     // отработает finally и для  SwEx4
            }
        } catch (SwEx4 e) {   // сюда после finally хотя это catch
            System.out.println("catch: SwEx4");
        }finally {
            System.out.println("finally2:");
        }

        }
    }
