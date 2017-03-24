package ch13.ex20.integra;

import java.util.Scanner;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nScanner Check\n");
        Scanner scanner = new Scanner("12 , 42, 53, 89 , 46# 09. 12");
        scanner.useDelimiter("\\s*[,.#]\\s*");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

    }
}
