package ch21.ex11.coded;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 29-Apr-17.
 */
public class CodeD {
    public static void app() {
        System.out.println("\n====CODE_D===");
        System.out.println("\nThread Exception Catch Check\n");

        System.out.println("Thread Exception Handler Demo:");
        CaptureUncaughtException.check();
        System.out.println("\nDefault Thread Exception Handler:");
        SettingDefaultHandler.check();

        System.out.println("\nSingle Thread Exception Handler:");
        SingleThreadException.check();

    }
}
