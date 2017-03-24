package ch13.ex15.include;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    private static int count = 1;
    private static void find(Matcher m) {
        System.out.printf("sequence %d:",count++);
        while (m.find()) {
            System.out.print(m.group()+" ");
        }
        System.out.println();

    }


    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nReplace Check\n");

        String s = "fix the rug with bags";
        String s2 = "fix the rig with rags";
        String regex = "[frb][aiu][gx]";

        Matcher m = Pattern.compile(regex).matcher(s);
        System.out.println(s);
        System.out.println(s2);
        find(m);
        find(m);
        m.reset();
        find(m);
        m.reset(s2);  // новые входные данные
        find(m);

    }
}
