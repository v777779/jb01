package ch13.ex20.remote;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nScanner RegEx Check\n");
        String s =
                "58.27.82.161@02/10/2005\n" +
                        "204.45.234.40@02/11/2005\n" +
                        "58.27.82.161@02/11/2005\n" +
                        "58.27.82.161@02/12/2005\n" +
                        "58.27.82.161@02/12/2005\n" +
                        "[Next log section with different data format]";

        Scanner scanner = new Scanner(s);
        String regex = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})"; // pattern под цифры
        while (scanner.hasNext(regex)) {
            scanner.next(regex);
            MatchResult matchResult = scanner.match(); //найти результат
            String ip = matchResult.group(1);
            String date = matchResult.group(2);
            System.out.printf("Link on %s from ip %s\n",date,ip );
        }


    }
}
