package ch21.ex11.codec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 29-Apr-17.
 */
public class CodeC {
    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\nThread Exception Check\n");

        System.out.println("Thread Exception Demo:");
        ExceptionThread.check();

        System.out.println("\nThread Exception Catch Demo:");  // не работает
        NativeExceptionHandling.check();


    }
}
