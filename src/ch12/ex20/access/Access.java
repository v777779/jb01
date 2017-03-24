package ch12.ex20.access;

import ch12.ex20.local.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 20 Check\n");
// класс потомок
        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.rainHard();
            si.event();             // переопределенный метод ничего не вызывает\
            si.empire();            // EmpireEx
            si.riseEm();            // EmpireEx >> RiseEmpireEx перехватывается EmpireEx

        } catch (PopFoul e) {       // atBat ловим напрямую
            System.out.println(e);
        } catch (RainedOut e) {     // конструктор RainedOut
            System.out.println(e);
        } catch (BaseBallEx e) {  // конструктор BaseBallEx, Foul, atBat Strike, Foul, Light
            System.out.println(e);
        } catch (EmpireEx e) {
            System.out.print("EmpireEx:");
            System.out.println(e.getClass().getSimpleName());
        }


        try {
            StormyInning si = new StormyInning();
            si.riseEm();            // EmpireEx >> RiseEmpireEx перехватывается EmpireEx

        } catch (RainedOut e) {     // конструктор RainedOut

        } catch (BaseBallEx e) {    // конструктор BaseBallEx, Foul, atBat Strike, Foul, Light

        } catch (EmpireEx e) {      // riseEm RiseEmpireEx
            System.out.print("EmpireEx:");
            System.out.println(e.getClass().getSimpleName());
        }

    }
}
