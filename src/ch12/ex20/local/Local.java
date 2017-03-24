package ch12.ex20.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    private static void cn(Exception e) {
        System.out.println(e.getClass().getSimpleName());
    }
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nException Limits Check\n");
// класс потомок
        System.out.print("main1:");
            try {
                StormyInning si = new StormyInning();
                si.atBat();
                si.rainHard();
                si.event();             // переопределенный метод ничего не вызывает
            } catch (PopFoul e) {       // atBat ловим напрямую
                cn(e);
            } catch (RainedOut e) {     // конструктор RainedOut
                cn(e);
            } catch (BaseBallEx e) {  // конструктор BaseBallEx, Foul, atBat Strike, Foul, Light
                System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());
            } catch (Exception e) {

            }

// восходящее преобразование
        System.out.print("main2:");
        try {
            Inning i = new StormyInning("str");
            i.atBat();
            i.event();      // переопределенный метод ничего не вызывает

        } catch (Foul e) {  // atBat PopFoul ловим по предку
            cn(e);
        } catch (BaseBallEx e) { // конструктор BaseBallEx, Foul, atBat Strike, Foul, Light
            System.out.println(e.getClass().getSimpleName()+":"+e.getMessage());
        }

    }
}
