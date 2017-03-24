package ch12.ex10.retry;

/**
 * Created by V1 on 01-Mar-17.
 */
public class Retry {
    public static void app() {
        System.out.println("\n====RETRY===");
        System.out.println("\nChange Exception Check\n");

        RetryNewEx rEx = new RetryNewEx();
        rEx.retryException();

    }
}
