package ch21.ex24.codea;

import ch21.ex24.codea.rest.Restaurant;
import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 07-May-17.
 */
public class CodeA {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nHanshaking Check\n");

        Restaurant.check();
        Time.sleep(1000);
    }
}
